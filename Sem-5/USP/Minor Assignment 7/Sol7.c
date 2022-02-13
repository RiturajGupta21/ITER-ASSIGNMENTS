#include <assert.h>
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <sys/wait.h>
#include <time.h>
#include <unistd.h>
struct Node{
int node;
int val;
int pid;
};

static void no_children(void){
int corpse;
int status;
while ((corpse = wait(&status)) > 0)
printf("PID %5d: child %5d exited 0x%.4X\n", (int)getpid(), corpse, status);
}

static void check_fds(void){
    struct stat sb;
    char buffer[128];
    char *bufptr = buffer;
    int n = snprintf(bufptr, sizeof(buffer), "PID %5d: ", (int)getpid());
    bufptr += n;
    for (int i = 0; i < 20; i++)
    {
        if (fstat(i, &sb) != 0)
            *bufptr++ = '-';
        else
            *bufptr++ = 'o';
    }
    *bufptr++ = '\0';
    printf("%s\n", buffer);
    fflush(stdout);
}

static void pr_result(const char *tag, const struct Node *result)
{
    char buffer[16];
    snprintf(buffer, sizeof(buffer), "%.12s:", tag);
    printf("%-13s PID = %5d, PPID = %5d, Node = %d (PID %5d), Value = %5d\n", buffer,
           (int)getpid(), (int)getppid(), result->node, result->pid, result->val);
    fflush(stdout);
}

static inline int new_bid(void)
{
    return rand() % 10000;
}

static inline void pr_channel(int i, int c[2])
{
    printf("%5d: C%d(%d,%d)\n", (int)getpid(), i, c[0], c[1]);
    fflush(stdout);
}

static inline void mk_channel(int i, int c[2])
{
    if (pipe(c) != 0)
    {
        fprintf(stderr, "%5d: failed to create pipe %d, (%d: %s)\n",
                (int)getpid(), i, errno, strerror(errno));
        exit(EXIT_FAILURE);
    }
    pr_channel(i, c);
}

static _Noreturn void be_parental(int i_pipe[2], int o_pipe[2])
{
    int pid = getpid();
    struct Node proc0 = { 0, new_bid(), pid };
    struct Node winner = { 0, 0, 0 };
    printf("PID %5d (PPID %5d): parent at work\n", pid, (int)getppid());
    printf("FD {%d, %d, %d, %d}\n", i_pipe[0], i_pipe[1], o_pipe[0], o_pipe[1]);
    check_fds();

    pr_result("Opening bid", &proc0);
    close(o_pipe[0]);
    printf("Writing opening bid to fd %d\n", o_pipe[1]);
    if (write(o_pipe[1], &proc0, sizeof(proc0)) != sizeof(proc0))
    {
        fprintf(stderr, "%5d: failed to write entry to fd %d (%d: %s)\n",
                pid, o_pipe[1], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }

    close(i_pipe[1]);
    if (read(i_pipe[0], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to read entry from fd %d (%d: %s)\n",
                pid, i_pipe[0], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }

    pr_result("Winning node", &winner);
    if (write(o_pipe[1], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to write entry to fd %d (%d: %s)\n",
                pid, o_pipe[1], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }
    close(o_pipe[1]);

    if (read(i_pipe[0], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to read entry from fd %d (%d: %s)\n",
                pid, i_pipe[0], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }
    close(i_pipe[0]);
    pr_result("Recirculated", &winner);

    no_children();
    check_fds();
    exit(EXIT_SUCCESS);
}

static _Noreturn void be_childish(int i, int i_pipe[2], int o_pipe[2])
{
    struct Node winner;
    int pid = getpid();
    printf("PID %5d (PPID %5d) i = %d: child at work\n", pid, (int)getppid(), i);
    printf("FD {%d, %d, %d, %d}\n", i_pipe[0], i_pipe[1], o_pipe[0], o_pipe[1]);
    check_fds();

    srand(pid);
    close(i_pipe[1]);
    if (read(i_pipe[0], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to read entry from fd %d (%d: %s)\n",
                pid, i_pipe[0], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }
    pr_result("Incoming bid", &winner);

    int newValue = new_bid();
    printf("PID: %5d, new offer %5d\n", pid, newValue);

    if (newValue > winner.val)
    {
        winner.node = i;
        winner.val = newValue;
        winner.pid = pid;
    }

    close(o_pipe[0]);
    pr_result("Outgoing bid", &winner);
    if (write(o_pipe[1], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to write entry to fd %d (%d: %s)\n",
                pid, o_pipe[1], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }

    if (read(i_pipe[0], &winner, sizeof(winner)) != sizeof(winner))
        exit(EXIT_FAILURE);
    pr_result("Final winner", &winner);
    close(i_pipe[0]);


    if (write(o_pipe[1], &winner, sizeof(winner)) != sizeof(winner))
    {
        fprintf(stderr, "%5d: failed to write entry to fd %d (%d: %s)\n",
                pid, o_pipe[1], errno, strerror(errno));
        exit(EXIT_FAILURE);
    }
    close(o_pipe[1]);

    no_children();
    check_fds();
    exit(i);
}

int main(int argc, const char *argv[])
{
    int numproc = 4;
    if (argc > 1)
        numproc = atoi(argv[1]);

    if (numproc < 2 || numproc > 10)
    {
        fprintf(stderr, "Number of processes %d is out of the range 2..10\n", numproc);
        exit(EXIT_FAILURE);
    }

    int seed = time(NULL);
    printf("%5d: seed: %d\n", (int)getpid(), seed);
    srand(seed);

    int tube[numproc][2];

    mk_channel(0, tube[0]);
    mk_channel(1, tube[1]);

    for (int i = 1; i < numproc; ++i)
    {
        if (i + 1 < numproc)
            mk_channel(i + 1, tube[i + 1]);
        int pid = fork();
        if (pid == -1)
        {
            fprintf(stderr, "fork error for child %d (%d: %s)\n", i, errno, strerror(errno));
            exit(1);
        }
        else if (pid == 0)
        {
            for (int c = 0; c < i; c++)
            {
                if ((i + 1) % numproc != c)
                {
                    printf("%5d: closing %2d and %2d\n", (int)getpid(), tube[c][0], tube[c][1]);
                    close(tube[c][0]);
                    close(tube[c][1]);
                }
            }
            be_childish(i, tube[i], tube[(i+1) % numproc]);
        }
    }

    for (int c = 2; c < numproc; c++)
    {
        printf("%5d: closing %2d and %2d\n", (int)getpid(), tube[c][0], tube[c][1]);
        close(tube[c][0]);
        close(tube[c][1]);
    }

    be_parental(tube[0], tube[1]);

    return 0;
}

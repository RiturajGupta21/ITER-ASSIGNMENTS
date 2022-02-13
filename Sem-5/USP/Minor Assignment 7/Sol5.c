#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
int main(int argc, char *argv[ ]) {
pid_t childpid;
int error;
int fd[2];
int i;
int nprocs;
if ( (argc != 2) || ((nprocs = atoi (argv[1])) <= 0) ) {
fprintf (stderr, "Usage: %s nprocs\n", argv[0]);
return 1;
}
if (pipe (fd) == -1) {
perror("Failed to create starting pipe");
return 1;
}
if ((dup2(fd[0], STDIN_FILENO) == -1) ||
(dup2(fd[1], STDOUT_FILENO) == -1)) {
perror("Failed to connect pipe");
return 1;
}
if ((close(fd[0]) == -1) || (close(fd[1]) == -1)) {
perror("Failed to close extra descriptors");
return 1;
}
for (i = 1; i < nprocs; i++) {
if (pipe (fd) == -1) {
fprintf(stderr, "[%ld]:failed to create pipe %d: %s\n",
(long)getpid(), i, strerror(errno));
return 1;
}
if ((childpid = fork()) == -1) {
fprintf(stderr, "[%ld]:failed to create child %d: %s\n",
(long)getpid(), i, strerror(errno));
return 1;
}
if (childpid > 0)
error = dup2(fd[1], STDOUT_FILENO);
else
error = dup2(fd[0], STDIN_FILENO);
if (error == -1) {
fprintf(stderr, "[%ld]:failed to dup pipes for iteration %d: %s\n",
(long)getpid(), i, strerror(errno));
return 1;
}
if ((close(fd[0]) == -1) || (close(fd[1]) == -1)) {
fprintf(stderr, "[%ld]:failed to close extra descriptors %d: %s\n",
(long)getpid(), i, strerror(errno));
return 1;
}
if (childpid)
break;
}
fprintf(stderr, "This is process %d with ID %ld and parent id %ld\n",
i, (long)getpid(), (long)getppid());
return 0;
}

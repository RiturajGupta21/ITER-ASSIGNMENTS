#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main () {
    pid_t pid;
    int fd[2];
    if (pipe(fd)) {
        perror("Pipe cannot be created");
        exit(1);
    }
    pid = fork();
    if (pid == -1) {
        return 1;
    }
    if (pid == 0) {
        dup2(fd[1],1);
        close(fd[0]);
        close(fd[1]);
        execlp("cat", "cat", "test.txt", NULL);
        return 1;
    } else {
        dup2(fd[0], 0);
        close(fd[0]);
        close(fd[1]);
        execlp("wc", "wc", "-l", NULL);
        return 1;
    }
}

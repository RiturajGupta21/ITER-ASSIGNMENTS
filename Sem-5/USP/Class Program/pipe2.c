#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
int main(){
    int fd[2];
    pid_t pid;
    pipe(fd);
    pid=fork();
    if(pid){
        dup2(fd[1],1);
        close(fd[0]);
        execlp("ls","ls","-l",NULL);
    }
    else{
        close(fd[1]);
        dup2(fd[0],0);
        execlp("sort","sort","-n",NULL);
    }
    return 0;
}

#include<stdio.h>
#include<unistd.h>
#include<errno.h>
int main(void) {
int fd[2],fs[2],fds[2];
if(pipe(fd) == -1){
perror("Failed to create the pipe");
return 1;
}
if(pipe(fs) == -1){
perror("Failed to create the pipe");
return 2;
}
if(pipe(fds) == -1){
perror("Failed to create the pipe");
return 3;
}
fork();
return 0;
}

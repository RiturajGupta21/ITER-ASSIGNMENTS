#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main(void) {
int fd[2],fs[2],fds[2];
pid_t pid;
pipe(fd);
pid=fork();
if(pid==0){
pipe(fs);
pipe(fds);
printf("%d %d %d %d %d %d",fd[0],fd[1],fs[0],fs[1],fds[0],fds[1]);
}
else{
wait(NULL);
printf("Parent waits\n");
}
printf("%d %d %d %d %d %d",fd[0],fd[1],fs[0],fs[1],fds[0],fds[1]);
return 0;
}

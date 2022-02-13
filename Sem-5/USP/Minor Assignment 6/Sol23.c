#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/types.h>
#include<errno.h>
int main(){
int fd1,fd2,n;
printf("PID=%ld\n",(long)getpid());
fd1=open("myfile.txt", O_RDONLY);
close(2);
printf("Donot enter anything:\n");
scanf("%d", &n);
/*
Open a new terminal and type ls /proc/PID/fd before
the input. The active fds of the process will be
*/
dup(fd1);
printf("Donot enter anything:\n");
/*
Open a new terminal and type ls /proc/PID/fd before
the input. The active fds of the process will be
*/
scanf("%d", &n);
dup2(fd1,fd2);
printf("Donot enter anything:\n");
scanf("%d", &n);
/*
Open a new terminal and type ls /proc/PID/fd before
the input. The active fds of the process will be
*/
return 0;
}

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/types.h>
#include<errno.h>
int main(){
int fd,fd1,fd2,dupret,fd3=8;
char buf[12];
printf("PID=%ld\n",(long)getpid());
fd=open("read.c",O_RDONLY);
fd1=open("read.c",O_RDONLY);
fd2=open("select.c",O_RDONLY);
dupret=dup2(fd,fd3);
if(dupret==-1){
perror("dup2 error");
return 1;
}
printf("Dup2 return=%d\n",dupret);
return 0;
}

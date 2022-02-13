#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/types.h>
#include<errno.h>
int main(){
int fd,fd1,fd2,dup2ret;
char buf[12];
printf("PID=%ld\n",(long)getpid());
fd=open("read.c",O_RDONLY);
fd1=open("read.c",O_RDONLY);
fd2=open("select.c",O_RDONLY);
fd=-3;
dup2ret=dup2(fd,-19);
if(dup2ret==-1){
perror("dup2 error");
return 1;
}
printf("Dup2 return=%d\n",dup2ret);
return 0;
}

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
close(fd1);
dup2ret=dup2(fd,fd2);
if(dup2ret==-1){
perror("dup2 error");
return 1;
}
printf("Value of fd2=%d\n",fd2);
printf("Dup2 return=%d\n",dup2ret);
scanf("%d",&fd);
return 0;
}

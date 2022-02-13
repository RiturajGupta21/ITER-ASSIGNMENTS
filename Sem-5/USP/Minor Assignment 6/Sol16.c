#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/types.h>
#include<errno.h>
int main()
{
int fd,var;
printf("PID=%ld\n",(long)getpid());
fd=open("read.c",O_RDONLY);
fd=open("read.c",O_RDONLY);
scanf("%d",&var);
return 0;
}

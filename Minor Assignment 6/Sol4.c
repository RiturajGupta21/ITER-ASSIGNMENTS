#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/stat.h>
int main(){
FILE *myfp,*fp;
int fd;
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
myfp=fopen("swap.c","w");
fp=fopen("swap.c","w");
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
fd=open("read.c",O_WRONLY);
printf("File descriptor number=%d\n",fd);
return 0;
}

#include<stdio.h>
#include<unistd.h>
#include<sys/stat.h>
#include<fcntl.h>
int main(){
int fd;
mkfifo("temp.txt",0600);
fd=open("temp.txt",O_WRONLY);
write(fd,"Writer\n",7);
close(fd);
return 0;
}

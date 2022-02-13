#include<stdio.h>
#include<unistd.h>
#include<sys/stat.h>
#include<fcntl.h>
int main(){
int fd;
char buf[100];
fd=open("temp.txt",O_RDONLY);
read(fd,buf,7);
write(1,buf,7);
close(fd);
unlink("temp.txt");
return 0;
}

#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
int fd;
fd=open("file.txt",O_WRONLY|O_CREAT|O_TRUNC,S_IRUSR|S_IWUSR|S_IRGRP);
printf("File Descriptor fd=%d\n",fd);
dup(STDOUT_FILENO);
close(1);
dup(fd);
close(fd);
printf("Now I am the Std Output and my fd is %d\n",fd);
write(STDOUT_FILENO,"USP\n",4);
write(STDOUT_FILENO,"USP\n",4);
return 0;
}

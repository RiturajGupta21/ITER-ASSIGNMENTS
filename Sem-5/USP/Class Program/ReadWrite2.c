#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
    int fd=open("file.txt",O_RDONLY);
    if(fd==-1){
	    printf("file does not exist");
    }
    char buf[100];
    ssize_t bytesread;
    bytesread=read(fd,buf,10);
    write(STDOUT_FILENO,buf,bytesread);
    return 0;
}

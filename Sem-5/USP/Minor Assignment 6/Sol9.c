#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
    char buf[100];
    ssize_t bytesread;
    bytesread=read(0,buf,100);
    int fd1=open("output.txt",O_WRONLY|O_CREAT,S_IRWXU);
    if(fd1==-1){
	printf("file does not exist");
    }
    write(fd1,buf,bytesread);
    printf("Fd1 = %d\n",fd1);
    close(fd1);
    printf("byteread=%d\n",(int)bytesread);
    
    int fd2=open("output.txt",O_RDWR|O_CREAT,S_IRWXU);
    if(fd2==-1){
	printf("file does not exist");
    }
    char buf1[100];
    ssize_t bytesread1;
    bytesread1=read(fd2,buf1,100);
        printf("Fd2 = %d\n",fd2);
    close(fd2);
    int fd3=open("output1.txt",O_WRONLY|O_CREAT,S_IRWXU);
    if(fd3==-1){
	printf("file does not exist");
    }
    write(fd3,buf1,bytesread1);
        printf("Fd3 = %d\n",fd3);
    close(fd3);
    printf("byteread=%d\n",(int)bytesread);
    return 0;
}

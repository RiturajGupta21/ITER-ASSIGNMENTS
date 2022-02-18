#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
    char buf[100];
    ssize_t bytesread;
    bytesread=read(0,buf,7);
    write(1,buf,bytesread);
    return 0;
}

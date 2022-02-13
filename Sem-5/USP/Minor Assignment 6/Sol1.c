#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
#define BLKSIZE 8
int main(void){
char buf[BLKSIZE];
read(STDIN_FILENO, buf, BLKSIZE);
write(STDOUT_FILENO, buf, BLKSIZE);
return 0;
}

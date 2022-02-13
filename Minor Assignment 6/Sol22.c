#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#define CREATE_FLAGS (O_WRONLY | O_CREAT |O_APPEND)
#define CREATE_MODE (S_IRUSR | S_IWUSR | S_IRGRP | S_IROTH)
int main(){
int fd;
fd=open("dup2test.txt",CREATE_FLAGS,CREATE_MODE);
if(dup2(fd,STDOUT_FILENO)==-1){
perror("Failed to redirect standard output");
return 1;
}
close(fd);
write(STDOUT_FILENO,"OK DONE",7);
return 0;
}

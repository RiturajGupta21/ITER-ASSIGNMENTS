#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/stat.h>
int main(){
FILE *myfp;
int fd,i;
for(i=0;i<16;i++){
myfp=fopen("read.c","r");
if(myfp==NULL){
printf("File opening error");
return 1;
}
fd=open("read.c",O_RDONLY);
if(fd==-1){
perror("Opening error");
return 2;
}
printf("FD number=%d\n",fd);
}
return 0;
}

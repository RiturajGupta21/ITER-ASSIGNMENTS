#include<stdio.h>
#include<sys/types.h>
#include<sys/uio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
FILE *fp;
fp=fopen("read.c","w");
if(fp==NULL){
return 1;
}
fprintf(fp,"File pointer is a handle to handle");
int fd = fileno(fp);
printf("File descriptor Number=%d\n",fd);
}

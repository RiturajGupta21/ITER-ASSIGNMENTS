#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<wait.h>
#include<sys/stat.h>
int main(){
pid_t pid;
int fd,i,status;
pid=fork();
if(pid==0){
for(i=0;i<5;i++){
fd=open("select.c",O_RDONLY);
printf("FD in child=%d\n",fd);
}
}
if(pid!=waitpid(-1,&status,0)){
for(i=0;i<5;i++){
fd=open("select.c",O_RDONLY);
printf("FD in parent=%d\n",fd);
}
}
return 0;
}

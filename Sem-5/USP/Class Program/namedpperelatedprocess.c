#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>
#include<unistd.h>
#include<stdlib.h>
#include<wait.h>
int main(int argc, char *argv[]){
pid_t childpid;
int fd,fd1;
char buf[20];
char str[20]="I am a Child";
int size=strlen(str);
if(argc!=2){
fprintf(stderr,"Usages %s pipename \n",argv[0]);
return 1;
}
mkfifo(argv[1],0600);
childpid=fork();
if(childpid==0){
fd=open(argv[1],O_WRONLY);
write(fd,str,size);
}
else{
fd1=open(argv[1],O_RDONLY);
read(fd1,buf,size);
write(1,buf,size);
wait(NULL);
unlink(argv[1]);
}
}

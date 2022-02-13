#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<wait.h>
#include<sys/stat.h>
#include <errno.h>

#define BLKSIZE 100
size_t copyfile(int fromfd, int tofd);
int main(int argc,char *argv[]){
   if(argc !=3){
      fprintf(stderr,"Usage : %s processsess\n",argv[0]);
   return 1;
   }
    int fd=open("ParentData.txt",O_RDONLY);
    if(fd==-1){
	printf("file does not exist");
    }
    int fd1=open("ChildData.txt",O_RDONLY);
    if(fd1==-1){
	printf("file does not exist");
    }
    pid_t pid;
    pid=fork();
    char buf[BLKSIZE];
    ssize_t bytesread;
    if(pid){
        bytesread=read(fd,buf,10);
        printf("byteread=%d\n",(int)bytesread);
    }
    else{
        bytesread=read(fd1,buf,10);
        printf("byteread=%d\n",(int)bytesread);
    }  
    size_t Totalbytes=copyfile(fd,STDOUT_FILENO);
    printf("Totalbytes =%d\n",(int)Totalbytes);
}

size_t copyfile(int fromfd, int tofd){
    char *bp, buf [BLKSIZE];
    int bytesread, byteswritten,totalbytes=0;
    for(;;){
       while(((bytesread=read(fromfd, buf , BLKSIZE))==-1)&&(errno == EINTR));
       if(bytesread <=0)
         break;
       bp=buf;
       while(bytesread>0){
           while(((byteswritten=write(tofd,bp,bytesread))==-1)&&(errno==EINTR)) ;
           if(byteswritten<=0) 
              break;
          totalbytes+=byteswritten;
          bytesread-=byteswritten;
          bp+=byteswritten;
      }
     if(byteswritten==-1)
        break;
    }
    return (size_t)totalbytes;
} 


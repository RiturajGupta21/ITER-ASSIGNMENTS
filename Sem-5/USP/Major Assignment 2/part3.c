#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
int main (int argc, char *argv[]){
int i,n;
pid_tchildpid=0; if (argc != 2){
fprintf(stderr, "Usage: %s processes\n", argv[0]); return 1;
}
n = atoi(argv[1]); for(i=1;i<n;i++){
if( (childpid=fork())<= 0)
break;
}
if(i!=(n/2)){
printf("i:%d [process] PID : %ld from [parent] PID : %ld [child] PID : %ld\n",i,(long)getpid(),(long)getppid(),(long)childpid);
wait(NULL);
}
if(i==(n/2)){
for(i=n+1;i<2*n;i++){
if(childpid=fork())
break;
}
if(i!=2*n){
printf("i:%d [process] PID : %ld from [parent] PID : %ld [child] PID :%ld \n",i,(long)getpid(),(long)getppid(),(long)childpid);
wait(NULL);
}
if(i==2*n){
for(i=2*n;i<3*n-1;i++){
if( (childpid=fork())<= 0)
break;
}
printf("i:%d [process] PID : %ld from [parent] PID : %ld [child] PID :%ld \n",i,(long)getpid(),(long)getppid(),(long)childpid);
wait(NULL);
}
}

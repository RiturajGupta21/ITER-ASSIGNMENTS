#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(int argc, char *argv[]){

   pid_t childpid = 0;
   int i,n;
   if(argc !=2){
      fprintf(stderr,"Usage : %s processsess\n",argv[0]);
   return 1;
   }
     n =atoi(argv[1]);
for(i=1;i<n;i++)
if(childpid = fork())
   break;
fprintf(stderr,"i:%d \nprocess ID: %ld \nparent ID: %ld \nchild ID:%ld\n",i,(long)getpid(),(long)getppid(),(long)childpid);
return 0;
}

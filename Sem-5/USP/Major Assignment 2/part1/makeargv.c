#include<stdio.h> 
#include<stdlib.h>
#include<unistd.h> 
#include<errno.h> 
#include<string.h>
int main(int argc,char *argv[]){
int i=0;
char *myargv[10];
if(argc!=2){
fprintf(stderr, "Usage: %s string\n", argv[0]); 
return 1;
}
else{
fprintf(stderr, "Usage: %s string\n", argv[0]); return 1;
execvp("a.out",&argv[1]);
myargv[0]=strtok(argv[1]," "); while(myargv[i]!=NULL){
printf("myargv[%d] ----> %s\n",i,myargv[i]); i++;
myargv[i]=strtok(NULL," ");
}
}
}


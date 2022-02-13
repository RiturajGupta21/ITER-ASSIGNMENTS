#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(int argc, char *argv[]){
    int n;
    if(argc !=2){
        fprintf(stderr,"Usage : %s processsess\n",argv[0]);
        return 1;
    }
    n =atoi(argv[1]);
    for(int i=0;i<n;i++){
        int pid=fork();
        if (pid <0 ){
            printf("Error in forking\n");
            exit(EXIT_FAILURE);
        }
        if(pid == 0){
            printf("i:%d \nprocess ID: %ld \nparent ID: %ld \nchild ID:%ld\n",i,(long)getpid(),(long)getppid(),(long)pid);
            exit(0);
        }
        else{
     	    wait(NULL);   
        }
    }
}

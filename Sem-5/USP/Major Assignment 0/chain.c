#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(int argc, char *argv[]){
    int pid;
    int i,n;
    int status;
    if(argc !=2){
        fprintf(stderr,"Usage : %s processsess\n",argv[0]);
        return 1;
    }
    n =atoi(argv[1]);
    for (i=0; i < n; i++){
        if ((pid=fork()) <0 ){
            printf("Error in forking\n");
            exit(EXIT_FAILURE);
        }
        else if (pid ==0) {
            printf("i:%d \nprocess ID: %ld \nparent ID: %ld \nchild ID:%ld\n",i,(long)getpid(),(long)getppid(),(long)pid);     
        }
        else {
            wait(NULL);
            exit(0);
        }
    }
    exit(EXIT_SUCCESS);
}


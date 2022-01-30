#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>

int main() {

    pid_t pid;
    int status;
    printf("Fork program Starting\n");
    pid=fork();
    
    if(pid<0){
        printf("Forked failed\n");
        exit(1);
    }
    
    else if(pid==0){
        printf("Child process id is %ld\n",(long)getpid());
        execl("/bin/ps","ps","-aux",NULL);
        printf("Exec Failed\n");
        exit(1);
    }
    
    else{
        printf("Parent Process %ld\n",(long)getpid());
    }
    
    wait(&status);
    printf("Child %ld exited already with status value %d now I am parent %ld eexiting\n",(long)pid,status,-(long)getpid());
    return 0;
}

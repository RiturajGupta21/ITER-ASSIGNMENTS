#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
#include "multhree.h"
int main(void){
pid_t pid = fork();
if ( pid == 0 ){
	MulThree();       
}
int status;     
waitpid(pid, &status, 0); 
if ( WIFEXITED(status)){
	int exit_status = WEXITSTATUS(status);       
	printf("Child %ld with exit status %d\n",(long)pid,exit_status);
}
return 0;
}

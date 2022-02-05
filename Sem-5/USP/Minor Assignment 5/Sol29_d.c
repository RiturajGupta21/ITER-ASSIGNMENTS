#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(void){
pid_t pid = fork();
char* args[] = {"grep", "-n", "123", "File.txt", NULL};
if ( pid == 0 ){
	execle("/bin/grep", "grep", "-n", "123", "File.txt", NULL,NULL);
}
int status;     
waitpid(pid, &status, 0); 
if ( WIFEXITED(status)){
	int exit_status = WEXITSTATUS(status);       
	printf("Child %ld with exit status %d\n",(long)pid,exit_status);
}
return 0;
}

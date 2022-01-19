#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(void){
pid_t childpid,pid;
int status;
pid=fork();
if(pid==0){
	printf("Child Part Executed!!!! and PID is %ld\n",(long)getpid());
        sleep(60);
	exit(0);
}
else{
	childpid=wait(&status);
	if(childpid==-1)
		perror("Failed to wait for child\n");
	else if(WIFEXITED(status) && !WEXITSTATUS(status)){
		printf("Child %ld terminated normally\n",(long)childpid);
		}
	else if(WIFEXITED(status))
		printf("Child %ld terminated with return status %d\n",(long)childpid,WEXITSTATUS(status));
	else if(WIFSIGNALED(status))
		printf("Child %ld terminated due to uncaught signal %d\n",(long)childpid,WTERMSIG(status));
	else if(WIFSTOPPED(status))
		printf("Child %ld stopped due to signal %d\n",(long)childpid,WSTOPSIG(status));
}
return 0;
}

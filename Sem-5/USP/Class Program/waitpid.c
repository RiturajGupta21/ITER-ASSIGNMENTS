#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(int argc, char *argv[]){
pid_t cpid,w;
int status;
cpid=fork();
if(cpid==-1){
	perror("fork");
	exit(EXIT_FAILURE);
}
if(cpid==0){
	printf("Child PID is =%ld\n",(long)getpid());
	//sleep(60);
	if(argc==1)
		pause();
	exit(0);
}
else{
	do{
		w=waitpid(cpid,&status,WUNTRACED | WCONTINUED);
		if(w ==-1){
			perror("waitpid");
			exit(EXIT_FAILURE);
		}
		if(WIFEXITED(status)){
			printf("Normally exited, status=%d\n",WEXITSTATUS(status));
		}
		else if(WIFSIGNALED(status)){
			printf("Killed by signal %d\n",WTERMSIG(status));
		}
		else if(WIFSTOPPED(status)){
			printf("Stopped by signal %d\n",WSTOPSIG(status));
		}
		else if(WIFCONTINUED(status)){
			printf("Stopped process is now continuing\n");
		}
	}
	while(!WIFEXITED(status) && !WIFSIGNALED(status));
	exit(EXIT_SUCCESS);
}
}

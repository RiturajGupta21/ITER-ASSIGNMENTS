#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(void){
pid_t childpid;
childpid=fork();
if(childpid==0)
	printf("Inside Child\n");
else{
	//wait(NULL);
	printf("In parent\n");
}
return 0;
}

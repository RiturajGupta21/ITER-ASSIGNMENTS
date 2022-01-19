#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main(void){
pid_t firstCh,secondCh;
pid_t returnR;
int sum;
firstCh=fork();
if(firstCh>0){
	printf("Parent Section\n");
	returnR=wait(NULL);
	printf("After the child process termination wait return value=%ld\n",(long)returnR);
}
if(firstCh==0){
	printf("The child process id=%ld\n",(long)getpid());
	sum=20+30;
	printf("sum=%d\n",sum);
	printf("Child Completes\n");
}
return 0;
}

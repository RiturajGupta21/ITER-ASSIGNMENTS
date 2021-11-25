#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main()
{
	if(fork()==0){
	
		printf("child %d\n",getpid());
		while(1);
	}
	else{
		printf("Parent %d\n",getpid());
		wait(NULL);
		while(1);
	}
	return 0;
}

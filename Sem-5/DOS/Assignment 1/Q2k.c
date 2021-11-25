#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	pid_t c1;
	int n=10;
	c1=fork();
	if(c1==0)
	{
		printf("Child\n");
		n=20;
		printf("n=%d \n",n);
	}
	else
	{
		wait(NULL);
		printf("Parent\n");
		printf("n=%d \n",n);
	}
	return 0;
}

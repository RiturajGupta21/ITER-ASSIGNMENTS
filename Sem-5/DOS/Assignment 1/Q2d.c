#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	pid_t pid;
	int i=5;
	pid=vfork();
	i=i+1;
	if(pid==0)
	{
		printf("Child: %d",i);
		_exit(0);
	}
	else
	{
		printf("Parent: %d",i);
	}
	return 0;
}

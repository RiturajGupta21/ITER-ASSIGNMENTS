#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main()
{
	int i=5;
	if(fork()==0)
	{
		printf("Child: %d",i);
	}
	else
	{
		printf("Parent: %d",i);
	}
	return 0;
}

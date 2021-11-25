#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main()
{
	if(fork()==0)
	{	
		printf("1");
	}
	else
	{
		wait(NULL);
		printf("2");
		printf("3");
	}
	return 0;
}

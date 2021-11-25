#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main()
{
	if(vfork()==0)
	{
		printf("1");
		_exit(0);
	}
	else
	{
		printf("2");
		printf("3");
	}
	return 0;
}

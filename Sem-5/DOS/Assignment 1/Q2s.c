#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	if(fork() == 0)
		if(fork())
			printf("1\n");
	return 0;
}

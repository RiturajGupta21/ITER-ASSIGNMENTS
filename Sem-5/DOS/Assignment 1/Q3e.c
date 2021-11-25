#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	if (fork() || fork())
	fork();
	printf(" 1 ");
	return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	pid_t c1=1,c2=1;
	c1 = fork();
	if (c1 != 0)
	c2 = fork();
	if (c2== 0)
	fork();
	printf(" 1");
	return 0;
}

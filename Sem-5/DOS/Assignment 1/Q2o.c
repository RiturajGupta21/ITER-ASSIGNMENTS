#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
int main( )
{
	int i=5;
	if(fork()==0)
		i=i+1;
	else
		i=i-1;
	fprintf(stderr,"%d",i);
	return 0;
}

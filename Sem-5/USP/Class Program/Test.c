#include<stdio.h>
#include<unistd.h>
int main(void){
	int i,c=0;
	for(i=1;i<5;i++)
	fork();
	printf("%ld\t%d\n",(long)getpid(),c);
	c=c++;
	return 0;
}

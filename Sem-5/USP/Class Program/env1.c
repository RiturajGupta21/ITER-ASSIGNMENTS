#include<stdlib.h>
#include<stdio.h>
int main(void){
	char *path,*path1;
	path=getenv("PATH");
	printf("%s\n",path);
	path1=getenv("HOME");
	printf("%s\n",path1);
	return 0;
}

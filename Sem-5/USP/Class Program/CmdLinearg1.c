#include<stdio.h>
int main(int argc,char** argv){
	printf("%d\n",argc);
	while(*argv!="\0"){
		printf("%s\n",*argv);
		argv++;
	}
}

#include<stdio.h>
extern char **environ;
int main(void){
	int i;
	for(i=0;environ!=NULL;i++){
		printf("environ[%d]; %s \n",i,environ[i]);
	}
	return 0;
}

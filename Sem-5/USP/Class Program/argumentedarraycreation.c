#include<stdio.h>
#include<string.h>
#include <stdlib.h>
char **makeargv(char *);
int main(){
	char s[]="This is a string";
	char **myargv;
	myargv=makeargv(s);
	if(myargv==NULL)
		fprintf(stderr,"Failed to construct an arrgumneted array\n");
	else{
		for(int i=0;myargv[i]!=NULL;i++)
			printf("Myargv[%d] :%s\n",i,myargv[i]);
	}
	return 0;
}
char **makeargv(char *s){
	int ntokens,i;
	char *t,**argvp;
	argvp=NULL;
	t=(char *)malloc(sizeof(char)*(strlen(s)+1));
	strcpy(t,s);
	if(strtok(s," ")!=NULL){
		for(ntokens=1;strtok(NULL," ")!=NULL;ntokens++);
	}
	printf("Number of tokens =%d\n",ntokens);
	argvp=(char **)malloc(ntokens+1)+sizeof(char *);
	*argvp=strtok(t," ");
	for(i=1;i<ntokens;i++){
		*(argvp+i)=strtok(NULL," ");
	}
	*(argvp+ntokens)=NULL;
	return argvp;
}

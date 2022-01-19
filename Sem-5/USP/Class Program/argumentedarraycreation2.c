#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int makeargv(const char *s, const char *delimiters, char ***argvp);
int main(int argc, char *argv[]) {
	char delim[] = " ";
	int i;int numtokens;
	char **myargv;
	if (argc != 2) {
		fprintf(stderr, "Usage: %s string\n", argv[0]);
		return 1;
	}
	if ((numtokens = makeargv(argv[1], delim, &myargv)) == -1) {
		fprintf(stderr, "Failed to construct an argument array for %s\n", argv[1]);
		return 1;
	}
	printf("The argument array contains:\n");
	for (i = 0; i < numtokens; i++)
		printf("%d:%s\n", i, myargv[i]);
	return 0;
}
int makeargv(const char *s,const char *delimeters, char ***argvp){
	int numtokens=-1,i;
	char *t;
	const char *snew;
	if((s==NULL)||(delimeters==NULL)||(argvp==NULL)){
		return -1;
	}
	*argvp=NULL;
	snew=s+strspn(s,delimeters);
	t=(char *)malloc(sizeof(char)*(strlen(snew)+1));
	strcpy(t,snew);
	if(strtok(t,delimeters)!=NULL){
		for(numtokens=1;strtok(NULL," ")!=NULL;numtokens++);
	}	
	*argvp=(char **)malloc((numtokens+1)*sizeof(char *));
	strcpy(t,snew);
	**argvp=strtok(t,delimeters);
	for(i=1;i<numtokens;i++)
		*(*argvp+i)=strtok(NULL," ");
	*(*argvp+numtokens)=NULL;
	return numtokens;
}

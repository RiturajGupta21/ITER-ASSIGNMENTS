#include<stdio.h>
#include <stdlib.h>
int main(){
FILE *myfp;
int fd;
myfp=fopen("file.txt","w");
if(myfp==NULL){
	perror("Opening Error");
	return 1;
}
fd=fileno(myfp);
printf("File descrpitor=%d\n",fd);
return 0;
}

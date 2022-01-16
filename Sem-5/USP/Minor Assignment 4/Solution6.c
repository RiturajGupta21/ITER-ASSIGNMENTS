#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(int argc, char *argv[]){
char* token,*token2,*last;
token=strtok(argv[1],argv[2]);
while (token!=NULL){
printf("Token=%s\n",token);
token2=strtok_r(token,argv[3],&last);
while(token2!=NULL){
printf("Subtoken=%s\n",token2);
token2=strtok_r(NULL,argv[3],&last);
}
token=strtok(NULL,argv[2]);
}
return 0;
}
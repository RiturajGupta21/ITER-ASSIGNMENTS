#include<stdio.h>
#include<string.h>
int main(){
char str[100];
fgets(str,100,stdin);
char *token;
token=strtok(str,"-");
int c=0;
while(token!=NULL){
c++;
printf("Token =%s \n ",token);
token=strtok(NULL,"-");
}
printf("Number of  Token =%d \n ",c);
return 0;
}	
//"ITER-IBCS-SHM-SUM-IDS"

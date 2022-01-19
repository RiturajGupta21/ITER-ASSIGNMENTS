#include<stdio.h>
#include<string.h>
int main(){
char str[100];
char deli[]="- * _ \n"
fgets(str,100,stdin);
char *token;
token=strtok(str,deli);
while(token!=NULL){
printf("Token =%s \n ",token);
token=strtok(NULL,deli);
}
return 0;
}	
//"ITER-IBCS-SHM-SUM-IDS"

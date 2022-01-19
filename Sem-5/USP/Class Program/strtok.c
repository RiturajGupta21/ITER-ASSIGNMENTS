#include<stdio.h>
#include<string.h>
int main(){
char str[]="Hello Everyone Welcome to the USP Lab";
char * token =strtok(str," ");
printf("%p",token);
while(token!=NULL){
printf("%p\n",token);
token=strtok(NULL," ");
printf("%s\n",token);
}
printf("%p\n",token);
return 0;
}

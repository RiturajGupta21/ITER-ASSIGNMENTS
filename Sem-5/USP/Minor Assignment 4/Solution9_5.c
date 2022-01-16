#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
char str[] ="TOC;;PLC,USP;";
char* token;
char *lasts;
token=strtok_r(str,";;,",&lasts);
while (token!=NULL){
printf("Token=%s\n",token);
token=strtok_r(NULL,";;,",&lasts);
}
return 0;
}

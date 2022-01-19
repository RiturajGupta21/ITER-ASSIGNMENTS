#include<stdio.h>
#include<string.h>
int main(){
char str[]="ITER-IBCS-SOA-SUM-IDS";
char ptr[]="iter-ibcs-soa-sum-ids-cse";
char *token,*ptoken,*strptr1,*strptr2;
token=strtok_r(str,"-",&strptr1);
ptoken=strtok_r(ptr,"-",&strptr2);
while(token!=NULL){
printf("Token =%s \n ",token);
token=strtok_r(NULL,"-",&strptr1);
}
return 0;
}	
//"ITER-IBCS-SHM-SUM-IDS"

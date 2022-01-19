#include<stdio.h>
#include<string.h>
int main(){
const char str[]="-#This is";
const char str1[]="--#";
int len=strspn(str,str1);
printf("%d\n",len);
return 0;
}

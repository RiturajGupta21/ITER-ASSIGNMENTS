#include<stdio.h>
#include<string.h>
int main(){
char s1[]="Hello ";
char s2[]="Dear Students";
strcat(s1,s2);
printf("After Copy - %s\n",s1);
return 0;
}

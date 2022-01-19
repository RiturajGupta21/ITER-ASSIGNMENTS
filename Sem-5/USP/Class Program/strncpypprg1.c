#include<stdio.h>
#include<string.h>
int main(){
char s1[]="Welcome to USP Lab";
//char s1[]="";
char s2[]="Lets Learn strncpy";
int size1=strlen(s1);
int size2=strlen(s2);
int n;
printf("Enter the number of bytes ");
scanf("%d",&n);
printf("Number of bytes u want to copy is n %d",n);
printf("String 1 size is %d\n",size1);
printf("String 2 size is %d\n",size2);
printf("String 1 Before Copy - %s\n",s1);
printf("String 2 Before Copy - %s\n",s2);
strncpy(s1,s2,n);
printf("After Copy - %s\n",s1);
printf("After Copy - %s\n",s2);
return 0;
}

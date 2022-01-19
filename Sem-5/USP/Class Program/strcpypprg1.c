#include<stdio.h>
#include<string.h>
int main(){
//char s1[]="hello students lets learn string in C";
char s1[]="NULL";
char s2[]="Hello Students Lets Learn String in C";
int size1=strlen(s1);
int size2=strlen(s2);
printf("String 1 size is %d\n",size1);
printf("String 2 size is %d\n",size2);
printf("String 1 Before Copy - %s\n",s1);
printf("String 2 Before Copy - %s\n",s2);
strcpy(s1,s2);
printf("After Copy - %s\n",s1);
return 0;
}

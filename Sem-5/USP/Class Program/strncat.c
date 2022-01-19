#include<stdio.h>
#include<string.h>
int main(){
char s1[10]="Hello ";
char s2[10]="SStudents";
int n;
printf("Enter the number of bytes ");
scanf("%d",&n);
printf("Number of bytes u want to copy is n %d",n);
strncat(s1,s2,n);
printf("After Copy - %s\n",s1);
return 0;
}

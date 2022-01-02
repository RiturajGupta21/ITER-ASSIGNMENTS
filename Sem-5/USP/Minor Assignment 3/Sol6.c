#include<stdio.h>
int main(){
char str[]={"IBCS\0"};
char str1[]={"SOADU"};
char *ptr = str;
char *ptr1 = str1;
while(*ptr != '\0') {
printf("%p\t%c\n", &ptr,*ptr);
ptr++;
}
while(*ptr1 != '\0') {
printf("%p\t%c\n", &ptr1,*ptr1);
ptr1++;
}
}

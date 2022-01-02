#include<stdio.h>
int main(){
char str[]={"SABCDE"};
char *ptr = str;
while(*ptr != '\0') {
printf("%p\t%c\n", &ptr,*ptr);
ptr++;
}
}

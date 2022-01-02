#include<stdio.h>
int main (){
int n[]={10,13,20,33,44};
int *ptr = n;
printf("%p\t%d\n", &ptr,*ptr);
ptr+=4;
printf("%p\t%d\n", &ptr,*ptr);
}


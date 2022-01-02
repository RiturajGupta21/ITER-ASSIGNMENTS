#include<stdio.h>
int main(){
    int a=52;
    int b=18;
    int *ptr1,*ptr2;
    ptr1=&a;
    ptr2=&b;
    if(*ptr1>*ptr2)
        printf("%s\n","A is greater");
    else
        printf("%s\n","B is greater");
}
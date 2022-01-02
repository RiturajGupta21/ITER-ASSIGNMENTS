#include<stdio.h>
int main(){
    int *ptr1,*ptr2,*ptr3;
    int Ia=23;
    ptr1=&Ia;
    ++*ptr1;
    printf("%d\n",Ia);
    ptr2=&Ia;
    ++*ptr2;
    printf("%d\n",Ia);
    ptr3=&Ia;
    ++*ptr3;
    printf("%d\n",Ia);
}
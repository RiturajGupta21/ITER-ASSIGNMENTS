/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
int main(){
    int ptr=25;
    int *ptr1;
    ptr1=&ptr;
    int **ptr2;
    ptr2=&ptr1;
    int ***ptr3;
    ptr3=&ptr2;    
    printf("ptr = %d\n",ptr);
    printf("&ptr = %p\n",&ptr);
    printf("ptr1 = %p\n",ptr1);
    printf("*ptr1 = %d\n",*ptr1);
    printf("ptr2 = %p\n",ptr2);
    printf("*ptr2 = %p\n",*ptr2);
    printf("**ptr2 = %d\n",**ptr2);
    printf("ptr3 = %p\n",ptr3);
    printf("*ptr3 = %p\n",*ptr3);
    printf("**ptr3 = %p\n",**ptr3);
}
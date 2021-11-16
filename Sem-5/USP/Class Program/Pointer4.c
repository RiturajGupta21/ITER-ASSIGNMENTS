/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
int main(){
    int ptr1;
    int *ptr2;
    int **ptr3;    
    int ***ptr4;
    ptr1=25;
    ptr2=&ptr1;
    ptr3=&ptr2;
    ptr4=&ptr3;
    printf("ptr1 = %d\n",ptr1);
    printf("&ptr1 = %p\n",&ptr1);
    printf("ptr2 = %p\n",ptr2);
    printf("&ptr2 = %p\n",&ptr2);
    printf("ptr3 = %p\n",ptr3);
    printf("&ptr3 = %p\n",&ptr3);
    printf("ptr4 = %p\n",ptr4);
    printf("&ptr4 = %p\n",&ptr4);
    printf("*ptr2 = %d\n",*ptr2);
    printf("*ptr3 = %p\n",*ptr3);
    printf("**ptr3 = %d\n",**ptr3);
    printf("*ptr4 = %p\n",*ptr4);
    printf("**ptr4 = %p\n",**ptr4);
    printf("***ptr4 = %d\n",***ptr4);
}
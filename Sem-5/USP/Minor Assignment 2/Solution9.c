/*
Prgrammer: Rituraj Gupta
Date completed: 1/12/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/

#include<stdio.h>
int main(){
    int a=12;
    int b=52;
    int c=8;
    int *ptr1,*ptr2,*ptr3;
    ptr1=&a;
    ptr2=&b;
    ptr3=&c;
    printf("%d\n",*ptr1+10);
    printf("%d\n",*ptr2+10);
    printf("%d\n",*ptr3+10);
}

/*
Prgrammer: Rituraj Gupta
Date completed: 1/12/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/

#include<stdio.h>
int main(){
    int Ivar=12;
    int *ptr,**Tptr;
    ptr=&Ivar;
    Tptr=&ptr;
    printf("%d\n",Ivar);
    printf("%p\n",ptr);
    printf("%d\n",*ptr);
    printf("%p\n",Tptr);
    printf("%d\n",**Tptr);
}

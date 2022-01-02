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
    int b=25;
    int c=18;
    int *ptr;
    ptr=&a;
    printf("%d\n",*ptr+10);
    ptr=&b;
    printf("%d\n",*ptr+10);
    ptr=&c;
    printf("%d\n",*ptr+10);
}

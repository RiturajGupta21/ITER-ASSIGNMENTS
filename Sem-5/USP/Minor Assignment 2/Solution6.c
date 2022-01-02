/*
Prgrammer: Rituraj Gupta
Date completed: 1/12/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/

#include<stdio.h>
int main(){
    int x=89;
    int *p1,*p2,*p3;
    p1=&x;
    p2=&x;
    p3=&x;
    printf("%d\n",*p1);
    printf("%d\n",*p2);
    printf("%d\n",*p3);
}

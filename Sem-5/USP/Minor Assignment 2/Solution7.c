/*
Prgrammer: Rituraj Gupta
Date completed: 1/12/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/

#include<stdio.h>
int main(){
    float x=8.6;
    float *p1,*p2,*p3;
    p1=&x;
    p2=&x;
    p3=&x;
    printf("%f\n",*p1);
    printf("%f\n",*p2);
    printf("%f\n",*p3);
}

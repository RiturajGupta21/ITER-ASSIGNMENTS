/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
int main(){
    float k=25;
    float *ptr1;
    ptr1=&k;
    printf("k=%f\n",k);
    printf("Address of k ptr1 =%p\n",ptr1);
    printf("Value of k using pointer ptr1 =%lf\n",*ptr1);
    printf("ptr1+1 =%p\n",ptr1+1);
    printf("*(ptr1+2) =%lf\n",*(ptr1)+2);

    char m='T';
    char *ptr2;
    ptr2=&m;
    printf("m=%c\n",m);
    printf("Address of m ptr2 =%p\n",ptr2);
    printf("Value of m using pointer ptr2 =%c\n",*ptr2);
    printf("ptr2+1 =%p\n",ptr2+1);
    printf("ptr2+1 =%u\n",*ptr2+1);

    int *m1,n=77;
    m1=&n;
    *m1=80;
    printf("m=%p\n",m1);
    printf("n=%d\n",n);
    printf("n=%d\n",*m1*10);
}
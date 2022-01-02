#include<stdio.h>
int main(){
    float x=6.7;
    float y=1.2;
    float z=2.3;
    float *p;
    p=&x;
    printf("Value %f\t Address%p\n",*p,p);
    p=&y;
    printf("Value %f\t Address%p\n",*p,p);
    p=&z;
    printf("Value %f\t Address%p\n",*p,p);
}
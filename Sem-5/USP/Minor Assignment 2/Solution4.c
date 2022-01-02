#include<stdio.h>
int main(){
    int x=45;
    int y=12;
    int z=23;
    int *p;
    p=&x;
    printf("Value %d\t Address%p\n",*p,p);
    p=&y;
    printf("Value %d\t Address%p\n",*p,p);
    p=&z;
    printf("Value %d\t Address%p\n",*p,p);
}
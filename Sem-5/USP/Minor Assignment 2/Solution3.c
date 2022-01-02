#include<stdio.h>
int main(){
    int a=5;
    int b=20;
    printf("Value %d\t Address%p\n",a,&a);
    printf("Value %d\t Address%p\n",b,&b);
    a=a^b;
    b=a^b;
    a=a^b;
    printf("Value %d\t Address%p\n",a,&a);
    printf("Value %d\t Address%p\n",b,&b);
}
// Address before and after will be same
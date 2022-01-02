#include<stdio.h>
int main(){
    int Ia=345;
    float Fb=4.5;
    char Chvar='Z';
    printf("Value %d\t Address%p\n",Ia,&Ia);
    printf("Value %f\t Address%p\n",Fb,&Fb);
    printf("Value %c\t Address%p\n",Chvar,&Chvar);
}
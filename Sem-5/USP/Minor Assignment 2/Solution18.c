#include<stdio.h>
void arrange(int *p1, int *p2);
int main(){
    int a=12,b=3,c=56,d=8,e=20,f=654;
    arrange(&a,&b);
    arrange(&a,&c);
    arrange(&a,&d);
    arrange(&a,&e);
    arrange(&a,&f);
    arrange(&b,&c);
    arrange(&b,&d);
    arrange(&b,&e);
    arrange(&b,&f);
    arrange(&c,&d);
    arrange(&c,&e);
    arrange(&c,&f);
    arrange(&d,&e);
    arrange(&d,&f);
    arrange(&e,&f);
    printf("The numbers in ascending order are: %d %d %d %d %d %d\n",a,b,c,d,e,f);
}
void arrange(int *p1, int *p2){
    int temp;
    if(*p1>*p2){
        temp=*p1;
        *p1=*p2;
        *p2=temp;
    }
}
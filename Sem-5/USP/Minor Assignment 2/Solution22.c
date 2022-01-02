#include<stdio.h>
void add(int *a,int *b){
    *a=*a+*b;
}
int main(){
    int a,b;
    printf("Input the first number : ");
    scanf("%d",&a);
    printf("Input the second number : ");
    scanf("%d",&b);
    printf("The sum of %d and %d is ",a,b);
    add(&a,&b);
    printf("%d",a);
}
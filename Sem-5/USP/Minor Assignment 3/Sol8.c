#include<stdio.h>
int main(){
float n[]={1.2,5.2,1.8,1.8,1.6,4.7};
float *ptr = n;
for(int i=0;i<6;i++){
printf("%p\t%.2f\n", &ptr,*ptr);
ptr++;
}
}

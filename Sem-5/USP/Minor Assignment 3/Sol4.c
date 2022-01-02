#include<stdio.h>
int main(){
int n[10];
n[0]=0;
n[1]=10;
n[2]=20;
n[3]=30;
n[4]=40;
n[5]=50;
n[6]=60;
n[7]=70;
n[8]=80;
n[9]=90;
int *ptr = n;
for(int i=0;i<10;i++){
printf("%p\t%d\n", &ptr,*ptr);
ptr++;
}
}

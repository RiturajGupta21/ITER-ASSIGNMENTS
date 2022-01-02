#include<stdio.h>
int main(){
int n[6];
n[0]=120;
n[1]=502;
n[2]=118;
n[3]=188;
n[4]=106;
n[5]=447;
int *ptr = n;
for(int i=0;i<6;i++){
printf("%p\t%d\n", &ptr,*ptr);
ptr++;
}
}

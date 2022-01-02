#include<stdio.h>
int main(){
int n[]={10,13,20,33,44};
float m[]={10.2,13.3,20.2,33.3,45.3,89.9};
int *ptr = n;
float *ptr1 =m;
for(int i=0;i<5;i++){
printf("%p\t%d\n", &ptr,*ptr);
ptr++;
}

for(int i=0;i<6;i++){
printf("%p\t%.2f\n", &ptr1,*ptr1);
ptr1++;
}
}

#include<stdio.h>
void f(int arr[]){
for(int i=0;i<3;i++){
printf("%d\n",arr[i]);
}
}
int main (){
int n[]={10,13,20,33,44};
int *ptr = n;
ptr+=2;
f(ptr);
}


#include <stdio.h>
#define N 10
int main(){
    int arr[N],arr1[N],i;
    for(i=0;i<=N;i++){
        arr[i]=i*i;
        arr1[i]=i*i*i;
    }
    for(i=0;i<=N;i++){
        printf("%d\t%d\n",arr[i],arr1[i]);
    }
}
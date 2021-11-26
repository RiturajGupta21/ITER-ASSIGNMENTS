/*
Prgrammer: Rituraj Gupta
Date completed: 20/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#define SIZE 5
int main(){
    int primeno[SIZE],i;
    char vowels[]={'A','E','I','O','U'};
    printf("Enter five prime numbers \n");
    for(i=0;i<5;i++){
        scanf("%d",&primeno[i]);
    }
    for(i=0;i<10;i++){
        if(i<=4)
            printf("%d ",primeno[i]);
        else
            printf("%c ",vowels[i-5]);
    }
    
}
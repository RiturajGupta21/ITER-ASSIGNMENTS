/*
Prgrammer: Rituraj Gupta
Date completed: 20/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
// Adding headerfiles for input output opertation and math functions
#include <stdio.h>
#include <math.h>
// Function to check wheater number is multiple of 7 11 or 13
int isMultiple(int n){
    if(n%7==0||n%11==0||n%13==0)/*condition for checking multiplication*/
        return 1;
    else
        return 0;
}
// Function to check wheater sum of digit is odd or even
int isOdd_Even(int n){
    int sum=0;
    while(n!=0){
        sum+=n%10;
        n/=10;
    }
    if(sum%2==0)
        return 0;
    else
        return 1;
}
int isPrime(int n){
    if(n<=1)
        return 0;
    int flag=1;
    for(int i=2;i<=sqrt(n);i++){
        if(n%i==0){
            flag=0;
            break;
        }
    }
    return flag;
}
void valuePassing(int n,int *isMultiplevalue,int *isSumOddEven,int *isPrimeValue){
    *isMultiplevalue=isMultiple(n);
    *isSumOddEven=isOdd_Even(n);
    *isPrimeValue=isPrime(n);
}
void display(int n,int isMultiplevalue,int isSumOddEven,int isPrimeValue){
    printf("Number is %d\n",n);
    if(isMultiplevalue=0)
        printf("\tNot a multiple of 7,11 or 13\n");
    else
        printf("\tMultiple of 7,11 or 13\n");
    if(isSumOddEven==0)
        printf("\tSum of digit is even\n");
    else
        printf("\tSum of digit is odd\n");
    if(isPrimeValue==1)
        printf("\tValue is prime number\n");
    else
        printf("\tValue is not a prime number\n");
}
int main(){
    int arr[6]={104,3773,13,121,77,30751};
    int n,mul,sum,prime;
    for(int i=0;i<sizeof(arr)/sizeof(arr[0]);i++){
        valuePassing(arr[i],&mul,&sum,&prime);
        display(arr[i],mul,sum,prime);
    }
}
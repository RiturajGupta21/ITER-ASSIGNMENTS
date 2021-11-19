/*
Prgrammer: Rituraj Gupta
Date completed: 17/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
// Write a C program to convert a decimal number into its equivalent binary number.

#include <stdio.h>
// #include <math.h>

long long convert(int n)
{
    long long binary = 0;
    int remainder, i = 1;
    while (n != 0)
    {
        remainder = n % 2;
        n /= 2;
        binary += remainder * i;
        i *= 10;
    }
    return binary;
}
int main()
{
    int n, binary;
    printf("Enter a decimal number -> ");
    scanf("%d", &n);
    binary = convert(n);
    printf("decimal %d  =  %lld in binary", n, binary);
    return 0;
}
/*
Prgrammer: Rituraj Gupta
Date completed: 17/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
// An integer n is divisible by 9 if the sum of its digits is divisible by 9. Develop a program to display
// each digit, starting with the rightmost digit. Your program should also determine whether or not the
// number is divisible by 9.

#include <stdio.h>
void isDivisible(int val)
{
    int sum = 0;
    int n = val;
    while (n > 0)
    {
        printf("%d\n", n % 10);
        sum += n % 10;
        n /= 10;
    }
    if (sum % 9 == 0)
    {
        printf("%d is divisible by 9\n", val);
    }
    else
    {
        printf("%d is not divisible by 9\n", val);
    }
}
int main()
{
    int n;
    printf("Enter an Integer -> ");
    scanf("%d", &n);
    isDivisible(n);
    return 0;
}
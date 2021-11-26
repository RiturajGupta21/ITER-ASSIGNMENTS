/*
Prgrammer: Rituraj Gupta
Date completed: 25/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
int main()
{
    double x[8] = {16.0, 12.0, 6.0, 8.0, 2.5, 12.0, 14.0, -54.5};
    int i;
    i = 5;
    printf("%d %.1f\n", 4, x[4]);
    printf("%d %.1f\n", i, x[i]);
    printf("%.1f\n", x[i] + 1);
    printf("%.1f\n", x[i + 1]);
    printf("%.1f\n", x[i + i]);
    printf("%.1f\n", x[2 * i]);
    printf("%.1f\n", x[2 * i - 3]);
    printf("%.1f\n", x[(int)x[4]]);
    printf("%.1f\n", x[i++]);
    printf("%.1f\n", x[--i]);
    x[i - 1] = x[i];
    printf("%.1f\n", x[i - 1]);
    x[i] = x[i + 1];
    printf("%.1f\n", x[i]);
    // x[i]-1=x[i];
    printf("%.1f\n", x[i] - 1);
}
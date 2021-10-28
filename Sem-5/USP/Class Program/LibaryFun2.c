/*
Prgrammer: Rituraj Gupta
Date completed: 28/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>
int main()
{
    //Assigning variable names 
    float first/*input*/,
    second/*input*/,
    resfirst,/*intermediate res*/
    ressec,/*intermediate res*/
    sum;/*output*/
    //Taking input 
    printf("Enter first and second ");
    scanf("%f%f",&first,&second);
    //Calculating the squareroot of first and second
    resfirst=sqrt(first);
    ressec=sqrt(second);
    //Displaying x and y
    printf("Square root of first %f and second %f \n",resfirst,ressec);
    //Calculating sum
    sum=resfirst+ressec;
    //displaying sum
    printf("Sum = %f \n",sqrt(sum));
    return 0;
}


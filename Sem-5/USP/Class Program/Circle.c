/*
Prgrammer: Rituraj Gupta
Date completed: 28/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>
#define pi 3.14159
int main()
{
    //Assigning variable names for radius area and perimeter
    float radius/*input*/,
    area/*output*/,
    perimeter/*output*/;
    // Taking radius from user
    printf("Enter the raidus : ");
    scanf("%f",&radius);
    //Calculating area "Area of Circle = pi*r^2"
    area=pi*pow(radius,2);
    //Calculating circumference "Circumfernce of Circle = 2*pi*r"
    perimeter=2*pi*radius;
    //Displaying the values
    printf("Area and Circumference for circle with radius %.2f is Area = %f \nand Circuference = %f \n",radius,area,perimeter);
    return 0;
}


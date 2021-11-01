/*
Prgrammer: Rituraj Gupta
Date completed: 30/10/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>
#define pi 3.14159
void circle(float);
int main(void)
{   
    //Assigning variable names for radius
    float radius;/*input*/
    // Taking radius from user
    printf("Enter the raidus : ");
    scanf("%f",&radius);
    circle(radius);
    return 0;
}
void circle(float radius){
    //Assigning variable names for area and perimeter
    float area/*output*/,
    perimeter/*output*/;
    //Calculating area "Area of Circle = pi*r^2"
    area=pi*pow(radius,2);
    //Calculating circumference "Circumfernce of Circle = 2*pi*r"
    perimeter=2*pi*radius;
    //Displaying the values
    printf("Area and Circumference for circle with radius %.2f is Area = %f \nand Circuference = %f \n",radius,area,perimeter);
 }


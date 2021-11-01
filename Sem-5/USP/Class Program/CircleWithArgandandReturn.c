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
float circlearea(float);
float circlecir(float);
int main(void)
{   
    //Assigning variable names for area and radius
    float area/*output*/,perimeter/*output*/,radius;/*input*/
    // Taking radius from user
    printf("Enter the raidus : ");
    scanf("%f",&radius);
    area=circlearea(radius);
    perimeter=circlecir(radius);
    //Display the output
    printf("Area for circle with radius %.2f is Area = %f \n",radius,area);
    printf("Circumference for circle with radius %.2f is Circuference = %f \n",radius,perimeter);
    return 0;
}
float circlearea(float radius){
    //Assigning variable names for area
    float area/*output*/;
    //Calculating area "Area of Circle = pi*r^2"
    area=pi*pow(radius,2);
    //returning the values
    return area;
 }
float circlecir(float radius){
    //Assigning variable names for circumference
    float perimeter/*output*/;
    //Calculating circumference "Circumfernce of Circle = 2*pi*r"
    perimeter=2*pi*radius;
    //returning the values
    return perimeter;
 }

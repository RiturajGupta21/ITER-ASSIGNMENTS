/*
Prgrammer: Rituraj Gupta
Date completed: 28/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>
#include <stdlib.h>
#define pi 3.14159
int main()
{
    //Assigning variable names 
    float x/*input*/,
    y/*input*/,
    res/*output*/;
    //Taking input 
    printf("Enter x and y ");
    scanf("%f%f",&x,&y);
    //Calculating the result
    res=y*abs(x-y);
    //Displaying result
    printf("Result = %f\n",res);
    return 0;
}


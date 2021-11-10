/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>

// Function prototypes
float temp();
float calculatespeed(float temp);
void display(float temp, float calculatespeed);

int main(){
    float speed;
    float tempvar;
    // Calling function
    tempvar=temp();
    speed = calculatespeed(tempvar);
    display(tempvar, speed);
    return 0;
}

// Getting Temperature input
float temp(){
    float temp;
    printf("Enter the temperature T *F -> ");
    scanf("%f", &temp);
    return(temp);
}

// Calculating speed
float calculatespeed(float temp){
    float res;
    res = 1086 * sqrt((5* temp +297)/(247));
    return(res);
}

// Displaying Results
void display(float temp, float calculatespeed){
    printf("Speed of sound at %f fareinhiet is : %f", temp, calculatespeed);
}
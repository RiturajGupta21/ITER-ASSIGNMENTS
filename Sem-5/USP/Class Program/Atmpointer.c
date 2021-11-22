/*
Prgrammer: Rituraj Gupta
Date completed: 20/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
// Number of kinds of bills dispense

// Adding headerfiles for input output opertation
#include <stdio.h>
// Function to calcute the diffrent kind of bills dispense
void dispense(int dollar, int *fifties, int *twenties, int *tens)
{
    *fifties = dollar / 50; /*Calculating the dispence value for 50*/
    *twenties = (dollar %= 50) / 20;/*Calculating the dispence value for 20*/
    *tens = (dollar %= 20) / 10;/*Calculating the dispence value for 10*/
}
int main()
{
    // Assing variables to be used for input and output
    int dollar/*input*/,
        fifties/*output*/,
        twenties/*output*/,
        tens/*output*/;
    // Taking user inpupt for the amount to be dispensed
    printf("Enter amount to dispense -> ");
    scanf("%d", &dollar);
    if(dollar%10==0){
        // Calling the dispense function
        dispense(dollar, &fifties, &twenties, &tens);
        // printing the value after calculation
        printf("Number of 50=%d | 20=%d | 10=%d\n", fifties, twenties, tens);
    }
    else{
        printf("Inputed value is not the multiple of 10");
    }
}
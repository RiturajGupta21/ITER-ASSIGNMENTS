/*
Prgrammer: Rituraj Gupta
Date completed: 20/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
// Macro for array size
#define SIZE 5
int main(){
    // intilising array for registration number and cgpa
    int regnumber[SIZE],i;
    float cgpa[SIZE];
    // Taking input for the array values and displaying
    for(i=0;i<SIZE;i++){
        printf("Enter the id and sgpa for student %d -> ",i+1);
        scanf("%d %f",&regnumber[i],&cgpa[i]);
        printf("%d\t%.2f\n",regnumber[i],cgpa[i]);
    }
    // Printing the value in tabular form
    printf("ID:\tCGPA\n");
    for(i=0;i<SIZE;i++){
        printf("%d\t%.2f\n",regnumber[i],cgpa[i]);
    }
   return 0; 
}
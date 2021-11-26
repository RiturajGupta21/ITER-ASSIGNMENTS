/*
Prgrammer: Rituraj Gupta
Date completed: 25/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
// Macro for array size
#define SIZE 100
// function to input the element and return the size of elements stored
int sentinal(float *arr){
    // Variable to calculate the number of elements entered
    int size = 0;
    while (1){
        float n;
        // Inputting array elements
        printf("Enter element at %d -> ",size);
        scanf("%f", &n);
        // If entered value is -1 then break the loop and returned
        if (n == -1)
            break;
        // Value stored in array
        arr[size++] = n;
    }
    return size;
}

int main(){
    printf("-----------------Instructions------------------\n");
    printf("Maximum elemets that can be entered is %d\n",SIZE);
    printf("Once -1 is entered no more value will be entered\n");
    printf("---------------------------------------------------\n");
    // intilising array
    float arr[SIZE];
    // Calling sentinal function
    int size = sentinal(arr);
    // Printing the values stored in array
    printf("-------------Elements Entered in array-----------------------\n");
    for (int i = 0; i < size; i++)
        printf("%.2f\n", arr[i]);
}
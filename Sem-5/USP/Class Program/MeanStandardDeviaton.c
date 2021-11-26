/*
Prgrammer: Rituraj Gupta
Date completed: 20/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>
// Macro for array size
#define SIZE 5
int main(){
    // intilising array for input and result
    float inp_arr[SIZE];
    float res[SIZE];
    // intilising varibales for calculating 
    float mean,standardeviation,sum=0,standardeviationsum;
    int i;
    printf("Maximum elements that can be entered = %d\n\n",SIZE);
    // Taking the values of item from user
    printf("Enter the items \n");
    for(i=0;i<SIZE;i++){
        printf("Enter item %d -> ",i+1);
        scanf("%f",&inp_arr[i]);
    }
    // Calculating the sum of items of array for mean calculation
    for(i=0;i<SIZE;i++){
        sum+=inp_arr[i];
    }
    // Calculating mean value
    mean=sum/(float)SIZE;
    // Calculating variance for calculating the standard deviation
    for(i=0;i<SIZE;i++){
        standardeviationsum+=pow((inp_arr[i]-mean),2);
    }
    // Calcuating standard deviation
    standardeviation=sqrt(standardeviationsum/(float)SIZE);
    for(i=0;i<SIZE;i++){
        res[i]=inp_arr[i]-mean;
    }
    // Displaying the mean
    printf("Mean of all items = %.2f\n\n",mean);
    // Displaying the Standard Deviation
    printf("Standard Deviation of all items  = %.2f\n\n",standardeviation);
    // Displaying the table for index item and differnce between item value and mean
    printf("-----------------------------------------------------------------------\n");
    printf("Index\tItem\tDiffernce\n");
    for(i=0;i<SIZE;i++){
        printf("%d\t%.2f\t%.2f\n",i+1,inp_arr[i],res[i]);
    }
}
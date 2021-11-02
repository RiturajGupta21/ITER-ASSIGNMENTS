/*
Prgrammer: Rituraj Gupta
Date completed: 02/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
//fuction for calculating the area
float area(float l,float b){
    //Calculating area
    return l*b;
}
//function for displaying the area
void display(){
    //Assigning variable for input and output
    float l/*input*/,b/*input*/;
    // Taking the input from user
    printf("Enter the length -> ");
	scanf("%f",&l);
	printf("Enter the breadth -> ");
	scanf("%f",&b);
    //Displaying the output
    printf("Area = %.2f",area(l,b));
}
int main(){
    //Calling display function
    display();
    return 0;
}
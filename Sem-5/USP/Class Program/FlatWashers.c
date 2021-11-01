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
int main(){
	//Assigning variable for input and output
	float dia1/*input*/,
	dia2/*input*/,
	height/*input*/,
	density/*input*/,
	quantity/*input*/,
	price/*input*/,
	totalweight/*output*/,
	weight/*intermediateoutput*/,
	area/*intermediateinput*/;
	// Taking the input from user
	printf("Enter the value of outside diameter");
	scanf("%f",&dia1);
	printf("Enter the value of inside diameter");
	scanf("%f",&dia2);
	printf("Enter the height of washer");
	scanf("%f",&height);
	printf("Enter the density of washer");
	scanf("%f",&density);
	printf("Enter the quantity of washer");
	scanf("%f",&quantity);
	printf("Enter the cost of 1 washer");
	scanf("%f",&price);
	//Calculating area
	area=pi*pow((dia1/2),2)-pi*pow((dia2/2),2);
	//Calculating weight of 1 washer
	weight=area*height*density;
	//Calculating total weight
	totalweight=quantity*weight;
	//Displaying the output
	printf("Weight of flat washer is %.2f",totalweight);
	printf("Cost of flat washer is %.2f",totalweight*price);
	return 0;
}

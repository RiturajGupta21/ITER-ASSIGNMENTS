/*
Prgrammer: Rituraj Gupta
Date completed: 02/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>

#define PI 3.1415926
double claculate(double n){
    // Calculating the factorial
    double factorial = sqrt((2*n+.33)*PI)*pow(n,n)*exp(-n);
    return factorial;
}
int main(){
	double n;
	printf("Enter a integer -> ");
	scanf("%lf", &n);
    // Calling and displaying calculate function
	printf("%.0lf! equals approximately %.5lf \n", n, claculate(n));
    return(0);
}
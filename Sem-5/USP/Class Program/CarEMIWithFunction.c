/*
Prgrammer: Rituraj Gupta
Date completed: 02/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#include <math.h>
float calculate(float ammount_borrowed,float monthly_int_rate,float total_no_payments){
    float monthly_payment=(monthly_int_rate*ammount_borrowed)/(1-pow(1+monthly_int_rate, -total_no_payments));
    return monthly_payment;
}
void display(){
    //Assigning variable for input and output
    float purchase_price/*input*/,down_payment/*input*/,annual_int_rate/*input*/,
    total_no_payments/*input*/,ammount_borrowed/*output*/,monthly_payment/*output*/,
    monthly_int_rate;
    //Taking user input from user
    printf("Enter the purchase price -> $");
	scanf("%f",&purchase_price);
	printf("Enter the down payment ammount -> $");
	scanf("%f",&down_payment);
    printf("Enter the annual interest rate -> ");
	scanf("%f",&annual_int_rate);
    printf("Enter the total number of payment (36,48,60) -> ");
	scanf("%f",&total_no_payments);
    //Calculating monthly interest rate
    monthly_int_rate=annual_int_rate/1200;
    //Calculating ammount borrowed
    ammount_borrowed=purchase_price-down_payment;
    //Displaying ammount borrowed
    printf("Ammount Borrowed $%.2f\n",ammount_borrowed);
    //Calculating monthly payment
    //Displaying monthly payment
    printf("Monthly Payment $%.2f",calculate(ammount_borrowed,monthly_int_rate,total_no_payments));
}
int main(){
    display();
    return 0;
}
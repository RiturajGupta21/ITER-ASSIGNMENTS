/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h> 
#define DEMAND_CHARGE 35.00 /* water demand charge */ 
#define PER_1000_CHARGE 1.10 /* charge per thousand gallon */ 
#define LATE_CHARGE 2.00 /* late charge on unpaid balance */ 
// Function prototypes
void instruction();
float Charge(float previous,float current);
float lateCharge(float unpaidammount);
void display(float totalammount,float unpaidammount, float lateCharge);
// Main Function
int main(){
    // Calling Instruction function
    instruction();
    //Assigning Variable for input and output
    float previous/*input*/,
    current/*input*/,
    unpaidammount/*input*/,
    totalammount/*output*/,
    useCharge/*output*/,
    lateChargevar/*output*/;
    //Taking user input
    printf("Enter previous -> $");
    scanf("%f",&previous);
    printf("Enter current -> $");
    scanf("%f",&current);
    printf("Enter the unpaid ammount -> $");
    scanf("%f",&unpaidammount);
    // Calling the function value in the variable
    useCharge=Charge(previous,current);
    lateChargevar=lateCharge(unpaidammount);
    // calculating total ammount
    totalammount=DEMAND_CHARGE+useCharge+unpaidammount+lateChargevar;
    // Calling display function
    display(totalammount,unpaidammount,lateChargevar);
}
// Function to show instruction to user
void instruction(){
    printf("This program figures a water bill based on the demand charge\n($%.2f) and a $%.2f per 1000 gallons use charge.\n\nA $%.2f surcharge is added to accounts with an unpaid balance.\n\n", DEMAND_CHARGE, PER_1000_CHARGE,LATE_CHARGE);
    printf("Enter unpaid balance, previous and current meter readings\non separate lines after the prompts.\nPress <return> or <enter> after typing each number.\n\n");
}
// Calculate use charge
float Charge(float previous,float current){
    float use,charge;
    // gallons of water used in 1000
    use=current-previous;
    // Charge of water used
    charge=use*PER_1000_CHARGE;
    return charge;
}
// Calculate late charge
float lateCharge(float unpaidammount){
    float Charge=0; /*charge if any previous balance not paid*/
    if (unpaidammount>0){
        Charge=LATE_CHARGE;
    }
    else{
        Charge=0;
    }
    return Charge;
}
// Display Output
void display(float totalammount,float unpaidammount, float lateCharge){
    if(lateCharge>0){
        printf("Late charge of %.2f on unpaid ammount of %.2f \n",lateCharge,unpaidammount);
    }
    printf("Total ammount to pay = %.2f",totalammount);
}
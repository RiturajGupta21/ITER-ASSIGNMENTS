/*
Prgrammer: Rituraj Gupta
Date completed: 22/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>

int main()
/* fixed rate for salesperson of mileagereimbursement*/
#define rate 0.35
{
    printf("Mileage Reimbursement Calculator\n");
    /*For Getting the value of odometer*/
    float odometer_init,odometer_fin,differnce,result;
    printf("Enter beginning odometer reading = ");
    scanf("%f",&odometer_init);
    printf("Enter ending odometer reading = ");
    scanf("%f",&odometer_fin);
    /*Calculate the differnce for distance*/
    differnce=odometer_fin - odometer_init;
    /*Calculating the cost of mileagereimbursement*/
    result=differnce*rate;
    /*printing the result*/
    printf("You traveled %.1f miles. At $%.2f per mile,\nyour reimursement is $ %.2f .\n",differnce,rate,result);
    return 0;
}

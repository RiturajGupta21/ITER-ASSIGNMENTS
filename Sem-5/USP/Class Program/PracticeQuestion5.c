/*
Prgrammer: Rituraj Gupta
Date completed: 26/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>

int main()
{
    //Assign variables names
    float vol_of_medicine,time_to_infuse,rate;
    //Taking the inputs
    printf("Volume to be infused (ml) = ");
    scanf("%f",&vol_of_medicine);
    printf("Minutes over which to infuse = ");
    scanf("%f",&time_to_infuse);
    //Printing the volume to be infused
    printf("VTIB:  %.2f \n",vol_of_medicine);
    //Calculating the rate
    rate=60/20*100;
    //Printing the rate
    printf("Rate : %.0f ml/hr \n",rate);
    return 0;
}

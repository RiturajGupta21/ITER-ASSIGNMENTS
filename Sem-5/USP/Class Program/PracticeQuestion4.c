/*
Prgrammer: Rituraj Gupta
Date completed: 26/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>
#define gravity 9.80
#define efficiency 0.9
int main()
{
    //Assign variables names
    float height,cubic_water,power,mass;
    //Taking the values for height and cubic water
    printf("Enter the height and number of cubic meter water ");
    scanf("%f %f",&height,&cubic_water);
    //Converting to mass
    mass =cubic_water*1000;
    //Calculating the power relevant formula is w=mgh with a consideration of efficiency
    power=(efficiency*(height*mass*gravity))/1000000;
    //Printing power generated
    printf("Power generated with 90 efficiency %.2f MW\n",power);
    return 0;
}


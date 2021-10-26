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
    int people,toilet;
    float flushmoreavg=14*15,flushlessavg=14*2;
    printf("Enter the number of people ");
    scanf("%d",&people);
    toilet=people/3;
    printf("Cost of installation %d \n",toilet*150);
    printf("Ammount of water saved %.2f liters/day\n",(flushmoreavg*toilet-flushlessavg*toilet));
    return 0;
}

/*
Prgrammer: Rituraj Gupta
Date completed: 22/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <stdio.h>
int main()
{
    char first,middle,last;/*input Customer's initials*/
    int dollars/*input number of dollar*/,
    quarters/*input number of quartes*/,
    dimes/*input number of dimes*/,
    nickels/*input number of nickels*/,
    pennies/*input number of pennies*/,
    total_dollar/*output total dollar value */,
    change/*output leftover change*/,
    total_cent=0/*total value in cent*/;
    /*Get and disp;ay the customer initials.*/
    printf("Type in your 3 initials and press return ");
    scanf("%c%c%c",&first,&middle,&last);
    printf("\n%c%c%c Please enter your coin information.\n",first,middle,last);
    /*Get the count of each kind of coin.*/
    printf("Number of $ coins > ");
    scanf("%d",&dollars);
    printf("Number of quarter > ");
    scanf("%d",&quarters);
    printf("Number of dimes > ");
    scanf("%d",&dimes);
    printf("Number of nickels > ");
    scanf("%d",&nickels);
    printf("Number of pennies > ");
    scanf("%d",&pennies);
    /* Compute the total value in cents.*/
    total_cent=100*dollars+25*quarters+10*dimes+5*nickels+pennies;
    /*Find the value in dollars and change*/
    total_dollar=total_cent/100;
    change=total_cent%100;
    /*Display the credit slip with value in dollar and change*/
    printf("\n\n %c%c%c Coin Credit \n Dollars : %d \n Change: %d cents\n",
    first,middle,last,total_dollar,change);
    return(0);
}


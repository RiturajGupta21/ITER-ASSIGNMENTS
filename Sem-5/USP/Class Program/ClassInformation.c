/*
Prgrammer: Rituraj Gupta
Date completed: 25/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
#define SIZE 1
int main()
{
    int regnumber[SIZE],sem[SIZE],i;
    float cgpa[SIZE];
    char sec[SIZE],name[SIZE][30];
    for (i = 0; i < SIZE; i++)
    {
        printf("Enter name ->");
        scanf(" %s", name[i]);
        printf("Enter reg ->");
        scanf("%d", &regnumber[i]);
        printf("Enter CGPA ->");
        scanf("%f",&cgpa[i]);
        printf("Enter sec -> ");
        scanf(" %c",&sec[i]);
        printf("Enter sem -> ");
        scanf("%d",&sem[i]);
    }
    printf("Name:\tReg\tCgpa\tsem\tsec\n");
    for (i = 0; i < SIZE; i++)
    {
        printf("%s\t%d\t%.2f\t%d\t%c\n", name[i],regnumber[i], cgpa[i],sem[i],sec[i]);
    }
    return 0;
}

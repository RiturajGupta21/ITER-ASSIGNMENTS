#include <stdio.h>
int main()
{
    float hardness, carbon, tensile;
    int h_f = 0, cc_f = 0, ts_f = 0;
    int grade;
    printf("Enter the value of Hardness -> ");
    scanf("%f", &hardness);
    printf("Enter the value of Carbon Content -> ");
    scanf("%f", &carbon);
    printf("Enter the value of Tensile Strength -> ");
    scanf("%f", &tensile);
    if (hardness > 50)
        h_f = 1;
    if (carbon < 0.7)
        cc_f = 1;
    if (tensile > 5600)
        ts_f = 1;
    if (h_f == 0 && cc_f == 0 && ts_f == 0)
        grade = 5;
    if (h_f == 1 || cc_f == 1 || tensile == 1)
        grade = 6;
    if (h_f == 1 && cc_f == 0 && ts_f == 1)
        grade = 7;
    if (h_f == 0 && cc_f == 1 && ts_f == 1)
        grade = 8;
    if (h_f == 1 && cc_f == 1 && ts_f == 0)
        grade = 9;
    if (h_f == 1 && cc_f == 1 && ts_f == 1)
        grade = 10;
    printf("The grade of steel is: %d", grade);
}
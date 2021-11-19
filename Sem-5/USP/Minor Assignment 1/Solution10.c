#include <stdio.h>
int main()
{
    float l_y, h_y, l_h, h_h;
    printf("Enter an yard length -> ");
    scanf("%f", &l_y);
    printf("Enter an yard width -> ");
    scanf("%f", &h_y);
    printf("Enter an house length -> ");
    scanf("%f", &l_h);
    printf("Enter an house length -> ");
    scanf("%f", &h_h);
    float diff = (l_y * h_y) - (l_h * h_h);
    printf("The time required to cut the grass of the yard is %.2f", diff / 2);
}
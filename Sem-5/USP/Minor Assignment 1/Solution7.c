#include <stdio.h>
#include <math.h>
#define pi 3.14159
int main()
{
    float radius,
        length,
        area,
        volume;
    printf("Enter the raidus -> ");
    scanf("%f", &radius);
    printf("Enter the length -> ");
    scanf("%f", &length);
    area = pi * pow(radius, 2);
    volume = area * length;
    printf("Area and Volume for circle %f & %f\n", area, volume);
    return 0;
}

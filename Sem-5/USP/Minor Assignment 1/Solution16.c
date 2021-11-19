#include <stdio.h>
#include <math.h>
double speeds_ratio(double max, double min)
{
    double speed;
    speed = pow((max / min), (1.0 / 5.0));
    return (speed);
}
int main()
{
    float max, min;
    printf("Input the max rpm -> ");
    scanf("%f", &max);
    printf("Input the min rpm -> ");
    scanf("%f", &min);
    printf("The ratio between successive speeds of a six-speed gearbox with maximum speed %.2f rpm,and minimum speed %.2f rpm, is. %.2f\n", max, min, speeds_ratio(max, min));
}
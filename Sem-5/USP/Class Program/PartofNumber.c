#include <stdio.h>
#include <math.h>
void part(float num, char sign, int whole, float fraction)
{
    float temp = fabs(num);
    if (num < 0)
    {
        sign = '-';
    }
    else if (num > 0)
    {
        sign = '+';
    }
    else
    {
        sign = ' ';
    }
    whole = floor(temp);
    fraction = temp - whole;
    printf("Parts of %.4f\n sign: %c\n", num, sign);
    printf(" whole number magnitude: %d\n fractional part: %.4f\n", whole, fraction);
}
int main()
{
    float num;
    char sign;
    int whole;
    float fraction;
    printf("Enter a value to analyze -> ");
    scanf("%f", &num);
    part(num, sign, whole, fraction);
    printf("Parts of %.4f\n sign: %c\n", num, sign);
    printf(" whole number magnitude: %d\n fractional part: %.4f\n", whole, fraction);
}

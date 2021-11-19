#include <stdio.h>
int main()
{
    int n, d, l, g;
    printf("Enter no egg -> ");
    scanf("%d", &n);
    g = n / 144;
    n = n % 144;
    d = n / 12;
    l = n % 12;
    printf("Your number of eggs is %d gross %d dozen %d", g, d, l);
}
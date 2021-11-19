#include <stdio.h>
int main()
{
    int m, n;
    scanf("%d", &m);
    scanf("%d", &n);
    printf("side1 = %d\nside2 = %d\nhypotenuse = %d", ((m * m) - (n * n)), (2 * m * n), ((m * m) + (n * n)));
}
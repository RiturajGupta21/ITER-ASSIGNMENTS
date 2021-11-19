#include <stdio.h>
int main()
{
    int a, b;
    scanf("%d", &a);
    scanf("%d", &b);
    printf("Before swap a=%d b=%d", a, b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("\nAfter swap a=%d b=%d", a, b);
}
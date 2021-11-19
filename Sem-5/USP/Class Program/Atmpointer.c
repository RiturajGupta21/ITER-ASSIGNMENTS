#include <stdio.h>
#include <math.h>
void dispense(int dollar, int *fifties, int *twenties, int *tens)
{
    printf("%d", dollar);
    *fifties = dollar / 50;
    *twenties = (dollar %= 50) / 20;
    *tens = (dollar %= 20) / 10;
}
int main()
{
    int dollar, fifties, twenties, tens;
    printf("Enter amount to dispense -> ");
    scanf("%d", &dollar);
    dispense(dollar, &fifties, &twenties, &tens);
    printf("Number of 50: %d\n 20: %d\n 10: %d\n", fifties, twenties, tens);
}
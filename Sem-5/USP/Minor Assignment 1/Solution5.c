#include <stdio.h>

int main()
#define rate 0.35
{
    printf("Mileage Reimbursement Calculator\n");
    float odometer_init, odometer_fin, differnce, result;
    printf("Enter beginning odometer reading = ");
    scanf("%f", &odometer_init);
    printf("Enter ending odometer reading = ");
    scanf("%f", &odometer_fin);
    differnce = odometer_fin - odometer_init;
    result = differnce * rate;
    printf("You traveled %.1f miles. At $%.2f per mile,\nyour reimursement is $ %.2f .\n", differnce, rate, result);
    return 0;
}
//Author Rituraj Gupta
// Convert distance from miles to kilometer
#include <stdio.h> //Standar library for printf, scanf defination
#define kms_per_mile 1.609 //Conversion constant
int main() {
	float mile,km;//Distance in mile and equivalent in km
//	Get the distance in mile through keyboard	
	scanf("%f", &mile);
	printf("The value read from the file is : %.2f\n",mile);
// 	Convert the distance in kilometer
	km = mile * kms_per_mile;
//	Display the distance in km	
	printf("Kilometer %8.2f \n", km);
	return 0;
}

//Author Rituraj Gupta
// Convert distance from miles to kilometer
#include <stdio.h> //Standar library for printf, scanf defination
#define kms_per_mile 1.609 //Conversion constant
int main() {
	float mile,km;//Distance in mile and equivalent in km
//	Get the distance in mile through keyboard	
	printf("Enter mile ");
	scanf("%f", &mile);
// 	Convert the distance in kilometer
	km = mile * kms_per_mile;
//	Display the distance in km	
	printf("Kilometer %8.2f ", km);
	return 0;
}

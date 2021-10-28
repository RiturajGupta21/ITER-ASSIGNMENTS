/*
Prgrammer: Rituraj Gupta
Date completed: 28/10/2021
Instructor Dr. T.N.Pandey
Registration Number: 1941012660
*/
#include <math.h>
#include <stdio.h>
int main() {
    //Assigning variable names 
    double a/*input*/,
    b/*input*/,
    c/*input*/,
    discriminant/*intermediate res*/,
    root1/*output*/,
    root2/*output*/,
    realpart/*output*/,
    imgpart/*output*/;
    printf("Enter a, b and c: ");
    //Taking the value of a b and c
    scanf("%lf %lf %lf", &a, &b, &c);
    //Calculating discriminat
    discriminant = b * b - 4 * a * c;
    //condition for real and different roots
    if (discriminant > 0) {
        //Calculating the value of 1st root
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        //Calculating the value of 2nd root
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        //Displaying the result
        printf("root1 = %.2lf and root2 = %.2lf \n", root1, root2);
    }
    //condition for real and equal roots
    else if (discriminant == 0) {
        //Calculating root value
        root1 = root2 = -b / (2 * a);
        //Displaying the result
        printf("root1 = root2 = %.2lf \n", root1);
    }
    // if roots are not real
    else {
        //Calculating real part
        realpart = -b / (2 * a);
        //Calculating imaginary part
        imgpart = sqrt(-discriminant) / (2 * a);
        //Displaying the result
        printf("root1 = %.2lf+%.2lfi and root2 = %.2f-%.2fi\n", realpart, imgpart, realpart, imgpart);
    }

    return 0;
} 


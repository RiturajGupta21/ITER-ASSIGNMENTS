#include <stdio.h>

#define ASCII_O 79
#define ASCII_o 111
#define ASCII_B 66
#define ASCII_b 98
#define ASCII_Y 89
#define ASCII_y 121
#define ASCII_G 71
#define ASCII_g 103
int main()
{
    char colour;
    printf("Enter the colour of the cylinder ->");
    scanf("%c", &colour);
    int intcolour = colour;
    if ((intcolour - ASCII_O) == 0 || (intcolour - ASCII_o) == 0)
    {
        printf("Cylinder contains: Ammonia\n");
    }
    else if ((intcolour - ASCII_B) == 0 || (intcolour - ASCII_b) == 0)
    {
        printf("Cylinder contains: Carbon Monoxide\n");
    }
    else if ((intcolour - ASCII_Y) == 0 || (intcolour - ASCII_y) == 0)
    {
        printf("Cylinder contains: Hydrogen\n");
    }
    else if ((intcolour - ASCII_G) == 0 || (intcolour - ASCII_g) == 0)
    {
        printf("Cylinder contains: Oxygen\n");
    }
    else
    {
        printf("Contents unknown.\n");
    }
    return 0;
}
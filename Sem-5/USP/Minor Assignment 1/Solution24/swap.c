#include "swap.h"
#include <stdio.h>

void swap(int x, int y)
{
    x = x + y;
    y = x - y;
    x = x - y;
    printf("swap appears in function: a=%d, b=%d\n", x, y);
}
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    char *a = argv[1];
    int num = atoi(a), i = 1;
    char str[20];
    printf("Enter the message -> ");
    scanf("%[^\n]%*c", str);
    while (i <= num)
    {
        printf("%d", i);
        if (i % 100 >= 11 && i % 100 <= 20)
            printf("th");
        else if (i % 10 == 1)
            printf("st");
        else if (i % 10 == 2)
            printf("nd");
        else if (i % 10 == 3)
            printf("rd");
        else
            printf("th");
        printf(" %s\n", str);
        i++;
    }
}
#include <stdio.h>
#include <stdlib.h>

int main () {
    printf("PWD : %s\n", getenv("PWD"));
    printf("HOME : %s\n", getenv("HOME"));
    printf("LOGNAME : %s\n", getenv("LOGNAME"));
    printf("USER : %s\n", getenv("USER"));
    printf("PATH : %s\n", getenv("PATH"));
    printf("COLORTERM : %s\n", getenv("COLORTERM"));
   return(0);
}
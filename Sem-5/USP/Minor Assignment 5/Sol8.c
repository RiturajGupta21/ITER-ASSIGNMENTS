#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(void){
printf("Fork create many confusion\n");
fork();
printf("We suppose to read and Practice\n");
return 0;
}

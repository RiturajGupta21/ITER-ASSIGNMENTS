#include <stdio.h>
#include <unistd.h>
int main(){
fork();
//printf("fork 1 1\n");
fork();
fork();
printf("1\n");
return 0;
}
//Number of process is equal to 2^number of fork=2^3=8

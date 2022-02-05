#include <stdio.h>
#include <unistd.h>
int main(void) {
fork();
fork();
fork();
fork();
printf("ITER\n");
printf("ITER\n");
printf("ITER\n");
sleep(4);
return 0;
}

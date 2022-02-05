#include <stdio.h>
#include <unistd.h>
int main()
{
fork();
fork() || fork();
fork();
printf("Really Interesting!!!\n");
sleep(2);
return 0;
}

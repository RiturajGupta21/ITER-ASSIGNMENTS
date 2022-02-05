#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int main(void)
{
printf("hello\n");
fork();
printf("hello\n");
fork();
printf("hello\n");
fork();
printf("hello\n");
sleep(2);
return 0;
}

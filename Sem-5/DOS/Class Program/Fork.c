#include <stdio.h>
#include <unistd.h>
int main(){
//fork();
printf("%d",fork());
//printf("Process id = %d \n",getpid());
return 0;
}

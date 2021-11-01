#include <stdio.h>
#include <unistd.h>
int main(){
pid_t c1=fork();
printf("\n process id %d \t c1 = %d \n",getpid(),c1);
return 0;
}

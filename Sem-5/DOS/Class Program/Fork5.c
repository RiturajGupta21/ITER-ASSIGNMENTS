#include <stdio.h>
#include <unistd.h>
int main(void){
int x;
x=0;
printf("%d\n",x);
fork();
x=1;
printf("%d\n",x);
return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(){
int pid,pid2;
pid=fork();
if(pid){
pid2=fork();
printf("iter");
}
else{
printf("iter\n");
pid2=fork();
}
return 0;
}

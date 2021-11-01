#include <stdio.h>
#include <unistd.h>
int main(){
if(fork() && fork()){
fork();
}
printf("Hello");
return 0;
}

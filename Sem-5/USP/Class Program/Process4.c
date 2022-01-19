#include<stdio.h>
#include<unistd.h>
int main(){
printf("I am process %ld\n",(long)getpid());
printf("My parrent process %ld\n",(long)getppid());
return 0;
}

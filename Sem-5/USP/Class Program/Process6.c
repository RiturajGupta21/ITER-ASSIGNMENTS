#include<stdio.h>
#include<unistd.h>
int main(void){
	int x;
	x=0;
	if(fork()==0){
		x=10;
		printf("I am process %ld and my x is %d\n",(long)getpid(),x);
	}
	else{
		x=20;
		printf("I am process %ld and my x is %d\n",(long)getpid(),x);
	}	
	 return 0;
}

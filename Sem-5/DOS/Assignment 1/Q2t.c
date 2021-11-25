#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
void fun1(){
	fork();
	fork();
	printf("1\n");
}
int main() {
	fun1();
	printf("1\n");
	return 0;
}

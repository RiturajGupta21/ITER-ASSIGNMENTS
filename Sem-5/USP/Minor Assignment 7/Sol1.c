#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main(){
	int fd1[2];
	char input_str[100];
	pid_t p;
	if (pipe(fd1) == -1) {
		fprintf(stderr, "Pipe Failed");
		return 1;
	}
	scanf("%s", input_str);
	p = fork();
	if (p < 0) {
		fprintf(stderr, "fork Failed");
		return 1;
	}
	else if (p > 0) {
		close(fd1[0]);
		write(fd1[1], input_str, strlen(input_str) + 1);
		close(fd1[1]);
               fprintf(stderr, "Parent");
		wait(NULL);
	}
	else {
		close(fd1[1]);
		read(fd1[0], input_str, 100);
               fprintf(stderr, "Chldd");
		exit(0);
	}
}


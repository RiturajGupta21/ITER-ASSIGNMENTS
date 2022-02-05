#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>
#include <sys/wait.h>
int main()
{
pid_t pid, pid1;
int status;
pid = fork();
if (pid < 0) { /* error occurred */
fprintf(stderr, "Fork Failed");
return 1;
}
else if (pid == 0) { /* child process */
pid1 = getpid();
printf("A->child: pid = %d",pid);
printf("B->child: pid1 = %d",pid1);
}
else {
/* parent process */
pid1 = getpid();
printf("C->parent: pid = %d",pid);
printf("D->parent: pid1 = %d",pid1);
wait(&status);
}
return 0;
}

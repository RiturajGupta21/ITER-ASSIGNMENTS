#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>
int main(){
int a=0, b=1, n=a+b,i;
printf("Enter the number of a Fibonacci Sequence:\n");
scanf("%d", &i);
pid_t pid = fork();
if (pid == 0){
    printf("Child is make the Fibonacci\n");
    printf("0 %d ",n);
    while (i>0) {
        n=a+b;
        printf("%d ", n);
        a=b;
        b=n;
        i--;
        if (i == 0) {
            printf("\nChild ends\n");
        }
    }
}
    else{
        printf("Parent is waiting for child to complete...\n");
        waitpid(pid, NULL, 0);
        printf("Parent ends\n");
    }
    return 0;
}

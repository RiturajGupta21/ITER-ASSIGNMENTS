#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include<errno.h>
#include<sys/wait.h>
#include <unistd.h>
int main(){
char* args[] = {"ls", NULL};
char* args1[] = {"wc","-l","-c",NULL};
int a[2];
pipe(a);
if(!fork()){
close(1);
dup(a[1]);
close(a[0]);
execv("/bin/ls",args);
}
else{
close(0);
dup(a[0]);
close(a[1]);
execv("/bin/wc",args1);
}
}


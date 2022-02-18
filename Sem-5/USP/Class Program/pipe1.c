#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>

int main(){
    int a[2];
    char buff[10];
    
    if(pipe(a)==-1){
        perror("Pipe cannot be created");
        exit(1);
    }
    
    write(a[1],"Rituraj",10);
    printf("\n");
    read(a[0],buff,10);
    printf("%s",buff);
    return 0;
}

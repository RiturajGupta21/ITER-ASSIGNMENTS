#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#define BUFFSIZE 10240
#define MAX_FILES 127

int main(int argc, char *argv[])
{
    int n,t,i;
    char buf[BUFFSIZE];
    char *myargv[MAX_FILES];
    if (argc == 1) {
        while(( n = read(STDIN_FILENO,buf,BUFFSIZE)) > 0) {
            if (write(STDOUT_FILENO, buf ,n ) != n) {
                perror("Write Error");
            }
        }
        if ( n < 0 ) {
            perror("Read Error");
        }
    }
    else {
        for ( i = 0; i < argc ; i++) {
            if (strcmp(argv[i],"-") != 0 ) {
                t = open(argv[i],O_RDONLY);
            }
            else {
                t = STDIN_FILENO;
            }
            while(( n = read(t,buf,BUFFSIZE)) > 0) {
                if (write(STDOUT_FILENO, buf ,n ) != n) {
                    perror("Write Error");
                }
            }
            if ( n < 0 ) {
                perror("Read Error");
            }
            if (close(t) == -1) {
                perror("Closing Error");
            }
        }
        }   
    exit(0);
}

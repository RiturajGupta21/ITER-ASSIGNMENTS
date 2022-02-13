#include <stdio.h>
#include <stdlib.h>
#include <string.h>

extern char ** environ;

void printEnv();
int changeEnv(char ** arr);
int runProg(char ** arr);

int main(int argc, char ** argv) {
    
    if(argc==1) {
        printEnv();
    }
    else {
        char * flag=argv[1];
        if(strcmp(flag, "-i")==0) {
            return changeEnv(&argv[2])?1:0;
        }
        else if(strcmp(flag, "utility")==0) {
            return runProg(&argv[2])?1:0;
        }
    }

    return 0;
}

void printEnv() {
    char * s;
    for(int i=0; (s=environ[i])!=NULL; i++) {
        printf("%s\n", s);
    }
}

int changeEnv(char ** arr) {
    char * s;
    for(int i=0; (s=arr[i])!=NULL; i++) {
        int status;
        if(status=putenv(s)) {
            fprintf(stderr, "Error: Unable to add %s\n", s);
            return status;
        }
    }
    return 0;
}

int runProg(char ** arr) {
    char * s;
    int count=0;
    
    for(int i=0; (s=arr[i])!=NULL; i++) {
        count+=strlen(s)+3;
    }
    
    char * str=(char *)malloc(sizeof(char)*count);
    count=0;

    for(int i=0; (s=arr[i])!=NULL; i++) {
        char ch;
        int ct=0;
        str[count++]='\"';
        while((ch=s[ct])!='\0') {
            str[count++]=s[ct++];
        }
        str[count++]='\"';
        str[count++]=' ';
    }
    str[count+1]='\0';
    
    return system(str);
}

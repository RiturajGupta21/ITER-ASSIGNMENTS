#include<stdio.h>
int main(int argc, char *argv[]){
    printf("Number of Argument : %d\n",argc);
    for(int i=0;i<argc;i++){
        printf("argv[%d] = %s\t",i,argv[i]);
    }
}
#include<stdio.h>
int main( int argc, char **argv ){
printf("%d\n",argc);
while(*argv!=NULL){
printf("%s",*argv);
argv++;
}
}

#include<stdio.h>
int main( int argc, char *argv[] ){
printf("%d\n",argc);
for(int i=0;argv[i]!=NULL;i++){
printf("%s\n",argv[i]);
}
}

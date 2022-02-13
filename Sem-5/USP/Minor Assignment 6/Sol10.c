#include <stdio.h>
int main(void){
fprintf(stdout,"a");
fprintf(stderr, "a has been written\n");
fprintf(stdout,"b");
fprintf(stderr,"b has been written\n");
fprintf(stdout,"\n");
return 0;
}

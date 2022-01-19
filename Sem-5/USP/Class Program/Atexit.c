#include<stdlib.h>
#include<unistd.h>
void display()
{
printf("function Exit handler\n");
}
int main(void) {
int i;
if (atexit(display)) {
fprintf(stderr, "Failed to install display exit handler\n");
return 1;
}
/* rest of main program goes here */
for(i=0;i<5;i++){
sleep(1);
printf("%d\n",i);
}
return 0;
}

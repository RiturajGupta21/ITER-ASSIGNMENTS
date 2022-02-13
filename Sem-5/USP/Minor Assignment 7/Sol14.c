#include<stdio.h>
#include<unistd.h>
int main(void) {
int fd[6],r;
r=pipe(fd);
if(r==-1){
printf("Pipe create error\n");
return 1;
}
printf("%d %d %d %d %d %d",fd[0],fd[1],fd[2],fd[3],fd[4],fd[5]);
while(1);

return 0;}

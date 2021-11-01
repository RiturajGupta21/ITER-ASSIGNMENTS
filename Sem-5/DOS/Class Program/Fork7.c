#include <stdio.h>
#include <unistd.h>
int main(void){
int i;
pid_t cpid;
for(i=0;i<4;i++){
cpid=fork();
if(cpid==0)
break;
}
printf("1\n");
return 0;
}

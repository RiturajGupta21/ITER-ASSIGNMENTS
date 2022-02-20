#include <stdio.h> 
#include <stdlib.h> 
#include <unistd.h>
int main (int argc, char *argv[])
{
pid_t childpid = 0; 
int i, n, nchars; 
char mybuf[20]; 
if (argc != 3)
{
fprintf(stderr, "Usage: %s processes\n", argv[0]); 
return 1;
}
n = atoi(argv[1]); 
nchars = atoi(argv[2]); 
for (i = 1; i< n; i++)
if (childpid = fork()) 
break;
for(i =0;i <nchars; i++) 
read(0,mybuf,i); 
mybuf[nchars]='\0';
fprintf(stderr,"Process ID : %ld String in mybuf :%s\n",(long)getpid(),mybuf); 
return 0;
}

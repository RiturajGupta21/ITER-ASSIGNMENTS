#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
int fd=open("file.txt",O_WRONLY|O_APPEND);
if(fd<0)
	printf("Error opening the file\n");
int cd=dup(fd);
write(cd,"10 30 40 88 234 1010 99 -500 -39 -26\n",2);
write(fd,"Hi written by file_desc\n",2);
return 0;
}

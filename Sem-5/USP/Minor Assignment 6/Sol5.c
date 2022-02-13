#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include<errno.h>
#include<sys/wait.h>
#include<unistd.h>
#define MAX_LEN 1024
int main(){
char ch,*str,*r;
int char_count = 0, word_count = 0, line_count = 0;
int in_word = 0,i=0;
char file_name[MAX_LEN];
FILE *fp,*fp2;
fp = fopen("input.txt", "r");
fp2 = fopen("output.txt", "w+");
while (1){
if(r=fgets(str, 500, fp)){
i++;
}
if (r == NULL)
break;
else if (i > 3)
fputs(str, fp2);
}
fclose(fp);
fclose(fp2);
printf("File copied Successfully!\n");
fp = fopen("input.txt", "r");
while ((ch = fgetc(fp)) != EOF) {
char_count++;
if(ch == ' ' || ch == '\t' || ch == '\0' || ch == '\n') {
if (in_word) {
in_word = 0;
word_count++;
}
if(ch = '\0' || ch == '\n') line_count++;    
}
else {
in_word = 1;
}
}
printf("In the file %s:\n", file_name);
printf("Number of characters: %d.\n", char_count);
printf("Number of words: %d.\n", word_count);
printf("Number of lines: %d.\n", line_count);
return 0;
}

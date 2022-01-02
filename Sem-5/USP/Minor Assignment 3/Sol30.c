#include<stdio.h>
#include<string.h>
#define MAX_LENGTH 40
char *bracket_by_len(char *temp, char* arr) {
char res[MAX_LENGTH];
int resultStringLen = 0, mainStringLen = strlen(arr), ind = 0;
if(mainStringLen > 10) {
res[resultStringLen++] = '/';
res[resultStringLen++] = '+';
while(arr[ind] !='\0')
res[resultStringLen++] = arr[ind++];
res[resultStringLen++] = '+';
res[resultStringLen++] = '/';
}
else if(mainStringLen > 4) {
res[resultStringLen++] = '*';
while(arr[ind] !='\0')
res[resultStringLen++] = arr[ind++];
res[resultStringLen++] = '*';
}
else if(mainStringLen > 0) {
res[resultStringLen++] = '<';
res[resultStringLen++] = '<';
while(arr[ind] !='\0')
res[resultStringLen++] = arr[ind++];
res[resultStringLen++] = '>';
res[resultStringLen++] = '>';
}
res[resultStringLen] = '\0';
strncpy(temp,res, 24);
}
int main(void) {
char str[MAX_LENGTH], temp[MAX_LENGTH];
printf("Enter a string : ");
scanf("%[^\n]%*c",str);
bracket_by_len(temp,str);
printf("%s\n",temp);
return (0);
}

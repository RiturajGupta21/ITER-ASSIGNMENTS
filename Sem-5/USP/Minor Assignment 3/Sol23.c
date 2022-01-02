#include <stdio.h>
#include <string.h>
#define SIZE 10
#define INPUT 30
int main(){
char temp[SIZE], code[INPUT];
int start, end;
printf("Enter MNOC product code: ");
scanf("%s", code);
for(start = 0; !(code[start] >= '0' && code[start] <= '9'); ++start);
strncpy(temp, code, start);
temp[start] = '\0';
printf("Warehouse : %s\n", temp);
for(end = start; code[end] < 'A' || code[end] > 'Z'; ++end);
strncpy(temp, &code[start], end - start);
temp[end - start] = '\0';
printf("Product : %s\n", temp);
printf("Qualifiers : %s\n", &code[end]);
return 0;
}
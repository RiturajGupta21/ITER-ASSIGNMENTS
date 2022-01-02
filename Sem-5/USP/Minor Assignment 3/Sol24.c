#include <stdio.h>
#include <string.h>
void trim_blanks(char str[], int size){
int i = 0;
char result[50];
while(str[i] == ' ')
i++;
while(str[size] == ' ')
size--;
strncpy(result, &str[i], size);
printf("%s\n", result);
}
void main(){
char a_string[50];
char n_string[50];
printf("Enter a string : ");
scanf("%[^\n]%*c", a_string);
trim_blanks(a_string, strlen(a_string));
}

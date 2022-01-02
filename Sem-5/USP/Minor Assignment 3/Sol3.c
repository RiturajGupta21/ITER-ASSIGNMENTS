#include<stdio.h>
int main(){
char str[100];
scanf("%[^\n]%*c", str);
char *ptr = str;
while(*ptr != '\0') {
printf("%p\n", &ptr);
ptr++;
}
}

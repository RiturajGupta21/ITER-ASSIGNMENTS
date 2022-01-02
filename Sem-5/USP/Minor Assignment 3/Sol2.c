#include<stdio.h>
int main(){
char str[11]="ITER SOA";
char *ptr = str;
while(*ptr != '\0') {
printf("%c", *ptr);
ptr++;
  }
}

#include <stdio.h>
void stringconcate(char s[],char t[]) {
int i=0, j;
while (s[i] != '\n')
++i;
for(j=0;t[j]!='\0';++j,++i)
s[i] =t[j];
s[i] = '\0';
printf("After concatenation: ");
puts(s);
}
int main() {
char s[100],t[100];
printf("Enter Two Strings:\n"); 
fgets(s,100,stdin);
fgets(t,100,stdin);
stringconcate(s,t);
return 0;
}
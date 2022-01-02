# include <stdio.h> 
# include <string.h> 
#define STRSIZ 20
int main(){
char s1[STRSIZ]="Jupiter ", s2[STRSIZ]="Symphony"; 
printf("%d %d\n", strlen(s1), strlen(strcat(s1, s2))); 
printf("%s\n", s1);
return 0;
}
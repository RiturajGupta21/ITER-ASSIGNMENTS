# include <stdio.h>
# include <string.h>
int main(){
char t1[]="";
char t2[]="Merry Christmas";
strncpy(t1, &t2[3], 5);
t1[5] = '\0';
printf("%s\n",t1);
return 0;
}

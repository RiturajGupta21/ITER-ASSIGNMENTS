# include <stdio.h> 
# include <string.h> 
int main(){
char pres[]="Adams, John Quincy"; 
char tmp1[40],tmp2[40]; 
strncpy(tmp1, &pres[7], 4); 
tmp1[4] = '\0';
strcat(tmp1, " ");
strncpy(tmp2, pres, 5);
tmp2[5] = '\0';
printf("%s\n", strcat(tmp1, tmp2)); 
return 0;
}
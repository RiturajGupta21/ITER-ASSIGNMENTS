#include <stdio.h> 
#include <string.h> 
void main(){
int n;
printf("Input number of strings: "); 
scanf("%d\n",&n);
char ch[n][100]; 
for(int i=0;i<n;i++)
fgets(ch[i],100,stdin); 
char temp[100];
for (int j=0; j<n-1; j++){
for (int i=j+1; i<n; i++){
if (strcmp(ch[j], ch[i]) > 0)
{
strcpy(temp, ch[j]);
strcpy(ch[j], ch[i]);
strcpy(ch[i], temp);
}
}
}
printf("The sorted strings are:\n"); 
for(int i=0;i<n;i++)
printf("%s",ch[i]);
}

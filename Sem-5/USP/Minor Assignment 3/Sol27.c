# include <stdio.h> 
# include <string.h>
int isPalindrome(char ch1[]){
int i=0,j=strlen(ch1)-2; 
while(i<j)
{
if(ch1[i]!=ch1[j]) 
return 0;
i++;
j--;
}
return 1;
}
int main(){
char ch[100]; 
printf("Enter A String: "); 
fgets(ch,100,stdin); 
if(isPalindrome(ch))
printf("Palindrom String\n"); 
else
printf("Non Palindrom String\n"); 
return 0;
}

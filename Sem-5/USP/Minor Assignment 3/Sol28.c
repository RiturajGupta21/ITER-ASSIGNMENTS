# include <stdio.h> 
# include <ctype.h> 
int main(){
int i=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
char ch,str[100]; 
printf("Input A String: "); 
ch=getchar();
while(ch!='\n'){
str[i]=ch; 
i=i+1; 
ch=getchar();
}
str[i]='\0';
printf("%s\n",str); 
for(i=0;str[i]!='\0';i++){
if(isalpha(str[i])){
c1=c1+1;
if(isupper(str[i])) 
c2=c2+1;
else
c3=c3+1;
}
else if(isdigit(str[i])) 
c4=c4+1;
else if(str[i]==' ') 
c5=c5+1;
else
c6=c6+1;
}
printf("Total number of alphabets: %d\n",c1); 
printf("Number of uppercase alphabets: %d\n",c2); 
printf("Number of lowercase alphabets: %d\n",c3); 
printf("Number of digits: %d\n",c4); 
printf("Number of punctuation mark: %d\n",c6); 
printf("Number of spaces: %d\n",c5);
return 0;
}
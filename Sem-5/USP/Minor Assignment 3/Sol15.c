# include <stdio.h>
int bytescount(char *s){
char *p=s; 
while(*p!='\0')
p++;
return p-s;
}
int main(){
int bc=bytescount("COVID-19 Still Active"); 
printf("%d\n",bc);
return 0;
}

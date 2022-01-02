# include <stdio.h>
int countchar(char *s){
int n;
for(n=0; *s!='\0'; s++) 
n++;
return n;
}
int main(){
int cc=countchar("Encourged to Vaccinate"); 
printf("%d\n",cc);
return 0;
}

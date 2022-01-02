# include <stdio.h> 
# include <string.h> 
int main(){
int n=2;
char s[100]="ITER",t[100]="SOA";
printf("Original String=> s: %s; t: %s\n",s,t); 
strncpy(s,t,n);
printf("Strncpy=> s: %s; t: %s\n",s,t); 
strncat(s,t,n);
printf("Strncat=> s: %s; t: %s\n",s,t); 
strncmp(s,t,n);
printf("Strncmp=> s: %s; t: %s\n",s,t); 
return 0;
}
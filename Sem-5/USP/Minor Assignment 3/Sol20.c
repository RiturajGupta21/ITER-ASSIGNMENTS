# include <stdio.h>
int charcopy(char *s, char *t){
int i=0;
while((*s++=*t++)!='\0')
i++;
*s='\0'; 
return(i);
}
int main(){
char pmsg[60];
int nc;
nc=charcopy(pmsg,"ITER CSE ");
printf("%d...%s\n",nc,pmsg);
return 0;
}
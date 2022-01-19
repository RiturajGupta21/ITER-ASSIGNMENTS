#include<stdio.h>
#include<string.h>
int checkpass(void);
int main(void){
int x;
x=checkpass();
fprintf(stderr,"x=%d\n",x);
if(x)
fprintf(stderr,"Password is correct !\n");
else
fprintf(stderr,"Password is not correct !\n");
}
int checkpass(void){
int x;
char a[9];
printf("Size of array a is : %ld\n",sizeof(a));
printf("Size of integer x is : %ld\n",sizeof(x));
x=0;
fprintf(stderr,"a at %p and \nx at %p\n",(void*)a, (void*)&x);
printf("Enter a short word :");
scanf("%s",a);
if(strcmp(a,"mypass")==0)
x=1;
return x;
}

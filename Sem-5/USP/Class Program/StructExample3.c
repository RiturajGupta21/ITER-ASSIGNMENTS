#include<stdio.h>
typedef struct studentinfo{
char name[30];
int regno;
char sec;
float sgpa;
}classl;

int main(){
classl student[2];
for(int i=0;i<2;i++){
printf("Enter the name, registration number, section and sgpa of a stuent\n");
scanf("%s %d  %c %f",student[i].name,&student[i].regno,&student[i].sec,&student[i].sgpa);
}
for(int i=0;i<2;i++){
printf("Student name %s\n",student[i].name);
printf("Student reg no %d\n",student[i].regno);
printf("Student sec %c\n",student[i].sec);
printf("Student sgpa %f\n",student[i].sgpa);
}
return 0;
}

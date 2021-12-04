#include<stdio.h>
typedef struct studentinfo{
char name[30];
int regno;
char sec;
float sgpa;
}classl;

int main(){
classl student;
printf("Enter the name, registration number, section and sgpa of a stuent\n");
scanf("%s %d  %c %f",student.name,&student.regno,&student.sec,&student.sgpa);
printf("Student name %s\n",student.name);
printf("Student reg no %d\n",student.regno);
printf("Student sec %c\n",student.sec);
printf("Student sgpa %f\n",student.sgpa);
return 0;
}

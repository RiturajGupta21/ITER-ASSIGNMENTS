#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

extern char** environ;
int main (void) {
   int i;

   if (environ != NULL) {
      printf ("The environment list follows:\n");
      for (i=0; environ[i] != NULL; i++)
         printf ("environ[%d]: %s\n", i, environ[i]);
   } else
        printf ("The environment is empty.\n");
   return 0;
}
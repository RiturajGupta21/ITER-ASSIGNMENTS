#include<stdio.h> 
#include<stdlib.h> 
#include<errno.h> 
#include<string.h> 
#include<unistd.h>
#include<sys/wait.h>
int makeargv(const char *s, const char *delimiters, char ***argvp);
int main(int argc, char *argv[]){
char delim[] = " \t"; 
char **myargv;
int i,numtokens,retval=-1; 
pid_t pid=fork();
if(pid==0)
{
if (argc != 2)
{
fprintf(stderr, "Usage: %s string\n", argv[0]); 
return 1;
}
if ((numtokens = makeargv(argv[1], delim, &myargv)) == -1)
{
fprintf(stderr, "Failed to construct an argument array for %s\n", argv[1]); 
return 1;
}
if(!strcmp(myargv[0],"ls") &&myargv[2]==NULL ) 
retval=execvp("ls",myargv); 
if(!strcmp(myargv[0],"ls"))
{
if(!strcmp(myargv[1],"-l") && !strcmp(myargv[2],"*.c")) 
retval=system("ls -l *.c");
else{}
}
retval=execvp("ls",myargv);
if(!strcmp(myargv[0],"wc")) 
retval=execvp("wc",myargv); 
if(!strcmp(myargv[0],"grep")) 
retval=execvp("grep",myargv); 
if(!strcmp(myargv[0],"cp")) 
retval=execvp("cp",myargv); 
if(retval==-1)
printf("execvp error\n"); 
return 0;
}
else if(pid==-1)
{
}
else
{
}
return -1;
wait(NULL); return 2;
return 0;
}
int makeargv(const char *s, const char *delimiters, char ***argvp)
{
int error,i,numtokens; const char *snew; char *t;
if ((s == NULL) || (delimiters == NULL) || (argvp == NULL))
{
errno = EINVAL; return -1;
}

*argvp = NULL;
snew = s + strspn(s, delimiters);
if ((t = malloc(strlen(snew) + 1)) == NULL) 
return -1; 
strcpy(t, snew); numtokens = 0;
if (strtok(t, delimiters) != NULL)
for (numtokens = 1; strtok(NULL, delimiters) != NULL; numtokens++);
if ((*argvp = malloc((numtokens + 1)*sizeof(char *))) == NULL)
{
error = errno; free(t); errno = error; return -1;
}
if (numtokens == 0)
free(t); 
else
{
strcpy(t, snew);
**argvp = strtok(t, delimiters); for (i = 1; i<numtokens; i++)
*((*argvp) + i) = strtok(NULL, delimiters);
}
*((*argvp) + numtokens) = NULL;
return numtokens;
}

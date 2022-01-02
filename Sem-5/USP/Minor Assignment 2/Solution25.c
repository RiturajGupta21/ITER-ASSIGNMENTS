#include <stdio.h>  
#include<string.h>
#include <ctype.h>
int main()  
{  
    int i, len = 0;  
    char str[100];  
    scanf("%[^\n]%*c", str);
    printf("The given sentence is: %s\n",str);
    len = sizeof(str)/sizeof(str[0]);  
    for(i = 0; i < len; i++){  
        if(isupper(str[i])){  
            str[i] = tolower(str[i]);  
        }  
        else if(islower(str[i])){  
            str[i] = toupper(str[i]);  
        }  
    }  
    printf("After Case REVERSAL the string is: %s\n", str);  
    return 0;  
}  
#include <stdio.h>
#include <string.h>
int main(){
	char str[30];
    scanf("%[^\n]%*c", str);
	char* token = strtok(str, " ");
	while (token != NULL) {
		printf("%s\n", token);
		token = strtok(NULL, " ");
	}

	return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	char str[20];
	char ch[3];
	while(1){
		printf("Enter yes/no ");
		scanf("%s", ch);
		if (strcmp(str, "yes")){
			printf("Enter System command ");
			scanf("%s", str);
			system(str);
		}
		else{
			break;
		}
	}
	return 0;
}

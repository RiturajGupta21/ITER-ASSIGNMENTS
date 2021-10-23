/*Rituraj Gupta
1941012660
CSE-l
*/
#include <stdio.h>
int main(){
	//intilsinzing the variable
	double m,f,i;
	printf("Enter meter feet and inch\n");
	//scanf to take user input
	scanf("%lf %lf %lf",&m,&f,&i);
	//displaying the result
	printf("Result %4.2lf meters %5.3lf ft. %8.4lfin. \n",m,f,i);
	return (0);
}	

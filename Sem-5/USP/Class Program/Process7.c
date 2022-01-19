#include<stdio.h>
#include<unistd.h>
void evenodd(int x){
	if(x%2==0){
		printf("Even\n");
	}
	else{
		printf("Odd\n");
	}
}
void isPrime(int x){
	int i,m=x/2,flag=0;  
	for(i=2;i<=m;i++){    
		if(x%i==0){    
			printf("Number is not prime\n");    
			flag=1;    
			break;    
		}    
	}    
	if(flag==0)    
		printf("Number is prime\n"); 
}    
int main(void){
	int x; 
	printf("Enter the number to check ");
	scanf("%d",&x);
	pid_t childpid;
	childpid=fork();
	if(childpid==-1){
		perror("Failed to fork");
		return 1;
	}
	if(childpid==0){
		isPrime(x);
		printf("I am child %ld and my parentid is %ld\n",(long)getpid(),(long)getppid());
	}
	else{
		evenodd(x);
		printf("I am parent %ld and my parentid is %ld\n",(long)getpid(),(long)getppid());
	}	
	 return 0;
}

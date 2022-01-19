#include<stdio.h>
#include<unistd.h>

void reverse(int x){
	int rev = 0, rem;
	while (x != 0) {
        	rem = x % 10;
	        rev = rev * 10 + rem;
        	x /= 10;
    	}
	printf("Reversed number = %d\n", rev);
}

void sumdigits(int x){
	int sum=0,dig;
	while(x>0){    
		dig=x%10;    
		sum=sum+dig;    
		x /= 10;    
	}    
	printf("Sum is = %d\n",sum);
}    

int main(void){
	int x; 
	printf("Enter the number ");
	scanf("%d",&x);
	pid_t processpid;
	processpid=fork();
	if(processpid==-1){
		perror("Failed to fork");
		return 1;
	}
	if(processpid==0){
		sumdigits(x);
		printf("I am child %ld \n",(long)getpid());
	}
	else{
		reverse(x);
		printf("I am parent %ld\n",(long)getpid());
	}	
	 return 0;
}

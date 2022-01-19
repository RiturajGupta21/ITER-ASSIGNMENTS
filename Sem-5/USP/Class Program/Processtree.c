#include<stdio.h>
#include<unistd.h>
#include <sys/wait.h>
void add(){
    int number1, number2, sum;    
    printf("Enter two numbers: ");
    scanf("%d %d", &number1, &number2);
    sum = number1 + number2;      
    printf("%d + %d = %d\n", number1, number2, sum);
}

void mul(){
    int number1, number2, mul;    
    printf("Enter two numbers: ");
    scanf("%d %d", &number1, &number2);
    mul = number1 * number2;      
    printf("%d + %d = %d\n", number1, number2, mul);
}

void sumofdigit(){
    int n,sum=0,m;    
    printf("Enter a number:");    
    scanf("%d",&n);    
    while(n>0){    
        m=n%10;    
        sum=sum+m;    
        n=n/10;    
    }    
    printf("Sum is=%d\n",sum);
}
void reverse(){
    int n, rev = 0, remainder;
    printf("Enter a number: ");
    scanf("%d", &n);
    while (n != 0) {
        remainder = n % 10;
        rev = rev * 10 + remainder;
        n /= 10;
    }
    printf("Reversed number = %d\n", rev);
}

int main(){
     pid_t fc,sc,tc;
     fc=fork();
     if(fc==-1){
	  perror("Failed to fork");
	  return 1;
     }
     if(fc==0){
     	  sc=fork();
     	  if(sc==-1){
	      perror("Failed to fork");
	  return 1;
          }
     	  if(sc==0){
     	      add();
     	      printf("Process->1\tID=%ld\n",(long)getpid());
     	  }
     	  else{
	      wait(NULL);
	      mul();
	      printf("Process->2\tID=%ld\n",(long)getpid());
	  }
     }
     else{
	   wait(NULL);
	   tc=fork();
	   if(tc==-1){
	       perror("Failed to fork");
	       return 1;
           }
	   if(tc==0){
	        sumofdigit();
		printf("Process->3\tID=%ld\n",(long)getpid());
	   }
	   else{
		wait(NULL);
		reverse();
		printf("Process->4\tID=%ld\n",(long)getpid());
	   }
     }
     return 0;
}

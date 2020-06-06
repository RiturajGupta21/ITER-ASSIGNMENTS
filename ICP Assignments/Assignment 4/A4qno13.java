import java.util.*; 
public class A4q13 { 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in); 
int n,r=0,s=0; 
System.out.println("Enter the number"); 
n=sc.nextInt(); 
while(n>0){ 
r=n%10; s+=r; n/=10;} 
if(s%9==0) System.out.println("is divisible by 9"); 
else System.out.println("is not divisible by 9"); 
}}  
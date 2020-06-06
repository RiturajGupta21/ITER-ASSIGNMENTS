import java.util.*;
public class A5qno22{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter an integer to be checked to be prime or not ");
int n = sc.nextInt();
int f= 0;
for(int i =2;i<=Math.sqrt(n);i++){
if(n%i==0){
f=1;
break;}}
if(f==0)
System.out.println("The number is prime");
else 
System.out.println("The number is not prime ");}}  
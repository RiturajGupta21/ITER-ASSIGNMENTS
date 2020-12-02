import java.util.*;
public class A5qno16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to be accepted");
int n=sc.nextInt(),r=0;
while(n>0){
int rem=n%10;
r=r*10+rem;
n=n/10;}
System.out.println("Number to be returned "+r);}}
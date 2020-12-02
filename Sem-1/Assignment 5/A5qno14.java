import java.util.*;
public class A5qno14{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
int a=0,b=1,i=2;
System.out.println("Enter the range");
int n=sc.nextInt();
while(n>i){
System.out.print(a+" "+b+" ");
a=a+b;
b=a+b; i+=2;}
if(i%n==0){
System.out.print(a+" "+b);}
else 
System.out.print(a);}}

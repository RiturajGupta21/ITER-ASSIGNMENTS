import java.util.*;
import java.util.Scanner;
public class A5Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter a number except 0 = ");
int n = sc .nextInt();
if (n!=0){
int p=0;
int n1=0;
double t=0.0;
double avg=0.0;
while(n!=0){
System.out.println("Enter the numbers");
n=sc.nextInt();
if(n>0)
p=p+1;
if (n<0)
n1=n1+1;
t=t+n;}
System.out.println("The number of positives is  "+p);
System.out.println("The number of negatives is  "+n1);
System.out.println("The total is "+t);
System.out.println(" The average is  "+t/(p+n1));}
else 
System.out.println("No numbers are entered except 0");
}}

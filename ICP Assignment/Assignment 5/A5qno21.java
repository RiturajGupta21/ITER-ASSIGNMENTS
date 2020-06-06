import java.util.*;
public class A5qno21{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the two number of which gcd has to be find");
int m=sc.nextInt();
int n=sc.nextInt();
int r=1;
while(r>0){
r=n%m;
n=m;
m=r;}
System.out.println("GCD of the numbers "+n);}}
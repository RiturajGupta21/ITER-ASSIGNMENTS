import java.util.Scanner;
public class A5qno8{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number whose factorial is to find ");
int n = sc.nextInt();
int i=1,p=1;
for(i=1;i<=n;i++){
p=p*i;}
System.out.println("The factorial of the number is = "+p);
}}
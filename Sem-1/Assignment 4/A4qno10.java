import java.util.Scanner;
public class A4qno10{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a no. for which you want to find the multiplication table:");
int n=sc.nextInt();
for (int i=1;i<=10;i++)
System.out.println(n+"*"+i+"="+n*i);
}}
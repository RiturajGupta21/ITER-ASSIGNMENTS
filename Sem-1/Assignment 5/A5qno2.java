import java.util.*;
public class A5qno2{
public static void main (String args[])	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students ");
int s = sc.nextInt();
int c=0;
for(int i=1;i<=s;i++){
System.out.println("Enter the "+i+"  number ");
int n = sc.nextInt();
if (n>=40)
c++;} 
System.out.println("The Students Who have passed = "+c);
}}
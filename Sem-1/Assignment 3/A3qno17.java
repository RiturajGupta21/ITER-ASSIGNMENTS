import java.util.*;
public class A3qno17{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("enter an integer");
int a=sc.nextInt();
if (a%5==0&&a%6==0)
System.out.println("Is " +a+" divisible by 5 and 6? true");
else 
System.out.println("Is " +a+" divisible by 5 and 6? false");
if (a%5==0||a%6==0)
System.out.println("Is " +a+" divisible by 5 or 6? true");
else 
System.out.println("Is " +a+" divisible by 5 or 6? false");
if ((a%5==0||a%6==0)&& (!((a%5==0)&&(a%6==0))))
System.out.println("Is " +a+" divisible by 5 or 6,but not both? true");
else 
System.out.println("Is " +a+" divisible by 5 or 6,but not both? false");
}}
import java.util.*;
public class A7qno1 {
public static void main(String[] args) {
Scanner  sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
double arr[]=new double[n];
double sum=0;
for(int i=0;i<n;i++) {
arr[i]=Math.random();
sum+=arr[i];}
System.out.println("Sum = "+sum);
System.out.println(("Avg = "+(sum/n)));}}
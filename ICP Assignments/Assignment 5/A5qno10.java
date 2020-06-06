import java.util.*;
public class A5qno10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of p for the expansion of sin p ");
double p=sc.nextDouble();
double x=Math.toRadians(p);
int i=1;
double error=0.000001,term=x,tsin=x;
while((Math.abs(term))>error){
i=i+2;
term =(-term*x*x)/((i-1)*i);
tsin=tsin+term;}
System.out.println("The infinite series expansion solution is  "+tsin);}}
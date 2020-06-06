import java.util.*;
public class A5qno11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of p for the expansion of cos p ");
double p=sc.nextDouble();
double x=Math.toRadians(p);
int i=0;
double error=0.000001,term=1,tcos=1;
while((Math.abs(term))>error){
i=i+2;
term =(-term*x*x)/((i-1)*i);
tcos=tcos+term;}
System.out.println("The infinite series expansion solution is  "+tcos);}}
import java.util.*;
public class A3qno6{
public static void main (String args[]){
Scanner sc =new Scanner (System.in);
System.out.println("Enter a,b,c of the quaratic equation ax^2+bx+c\n e=(a*x)+(b*y)\n f=(c*x)+(d*y)");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
double e=sc.nextDouble();
double f=sc.nextDouble();
double x=((e*d)-(b*f))/((a*d)-(b*c));
double y=((a*f)-(e*c))/((a*d)-(b*c));
if((a*d)-(b*c)!=0)
{
System.out.println("x is "+x +" and "+"y is "+y);
}
else
{
System.out.println("no solution");
}}}
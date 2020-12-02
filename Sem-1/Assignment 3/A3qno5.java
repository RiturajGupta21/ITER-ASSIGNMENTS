import java.util.*;
public class A3qno5{
public static void main (String args[]){
Scanner sc =new Scanner (System.in);
System.out.println("Enter a,b,c of the quaratic equation ax^2+bx+c");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=(b*b)-(4*a*c);
double r1,r2;
if (d>0)
{
r1=((-b+(Math.sqrt(d)))/(2*a));
r2=((-b-(Math.sqrt(d)))/(2*a));
System.out.println("root are "+r1+" "+r2);
}
else if (d==0)
{
r1=((-b+(Math.sqrt(d)))/(2*a));
System.out.println("root are "+r1);
}
else {
System.out.println("no real roots");
}
}}
import java.util.*;
public class A2qno10{
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter x1 y1");
System.out.println("Enter x2 y2");
System.out.println("Enter x3 y3");
double x1=s.nextDouble();
double y1=s.nextDouble();
double x2=s.nextDouble();
double y2=s.nextDouble();
double x3=s.nextDouble();
double y3=s.nextDouble();
double a=Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
double b=Math.sqrt((Math.pow((x3-x2), 2))+(Math.pow((y3-y2), 2)));
double c=Math.sqrt((Math.pow((x3-x1), 2))+(Math.pow((y3-y1), 2)));
double x=(a+b+c)/2;
double area=Math.sqrt(x*(x-a)*(x-b)*(x-c));
System.out.println("Area="+area);
}
}

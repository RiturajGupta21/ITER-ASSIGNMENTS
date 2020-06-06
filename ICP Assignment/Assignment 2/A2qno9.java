import java.util.*;
public class A2qno9 {
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter x1,y1,x2,y2");
double x1=s.nextDouble();
double y1=s.nextDouble();
double x2=s.nextDouble();
double y2=s.nextDouble();
double d=Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
System.out.println("distance="+d);
}
}

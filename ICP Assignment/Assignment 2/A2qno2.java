import java.util.Scanner;
public class A2qno2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter radius & lenght");
double r=s.nextDouble();
double l=s.nextDouble();
double area=Math.PI*r*r;
System.out.println("Area of Cylinder"+area);
System.out.println("Vol of Cylinder"+(area*l));
}
}

import java.util.Scanner;
public class A2qno6 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter mass aand height in pound and inch");
double m=s.nextDouble();
double h=s.nextDouble();
m=0.45359237*m;
h=0.0254*h;
double bmi=m/(h*h);
System.out.println("BMI="+bmi);
}
}

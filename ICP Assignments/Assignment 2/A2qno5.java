import java.util.Scanner;
public class A2qno5 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter The V0,V1&time ");
double v0=s.nextDouble();
double v1=s.nextDouble();
double t=s.nextDouble();
double acc=(v1-v0)/t;
System.out.println("avg acc is"+acc);
}
}

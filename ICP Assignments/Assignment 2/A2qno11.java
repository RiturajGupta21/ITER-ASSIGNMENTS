import java.util.*;
public class A2qno11 {
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("investment amount, annual interest rate, and number of years");
double ia=s.nextDouble();
double air=s.nextDouble();
double noy=s.nextDouble();
double am=ia*Math.pow((1+(air/12)),(noy*12));
System.out.println("amount="+am);
}
}

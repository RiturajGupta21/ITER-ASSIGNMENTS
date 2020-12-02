import java.util.*;
public class A6qno8{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the number of sides ");
int n  = sc.nextInt();
System.out.println("Enter the length of the side ");
double sl =   sc.nextDouble();
double call = area ( n , sl);
System.out.println("The area of the polygon is :"+call);}
public static double area(int n , double side ){
double a = (n * side * side )/(4*Math.tan(Math.PI/n)) ;
return a;}}
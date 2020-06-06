import java.util.Scanner;
public class A5qno12{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the x for Taylor series expansion ");
double x=sc.nextInt();
double term=x,sum = 1 + x,error= 0.000001;
int i = 2 ;
while ((Math.abs(term))>error){
term = term *x / ((i-1)*i);
sum =sum + term ;
i =i+2 ;}
System.out.println("The subation of Taylor series is "+sum );}}
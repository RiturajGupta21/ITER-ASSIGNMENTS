import java.util.*;
public class A3qno11{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the weight and Height in Si units");
double w=sc.nextDouble();
double h=sc.nextDouble();
double BMI=w/Math.pow(h,2);
if (BMI<=18.5)
System.out.println("Under Weight");
if (BMI>18.5&&BMI<=24.9)
System.out.println("Normal Weight");
if (BMI>25&&BMI<=29.9)
System.out.println("Over Weight");
if (BMI>=30)
System.out.println("Obese");
}}

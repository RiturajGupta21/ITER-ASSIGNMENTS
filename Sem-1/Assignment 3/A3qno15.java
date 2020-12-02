import java.util.*;
public class A3qno15{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("enter a point (x, y)");
double x=sc.nextDouble();
double y=sc.nextDouble();
double c=Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));//as centre=(0,0)
//radius =10
if (c>10){
System.out.println("Point "+"("+x+","+y+")"+" is not in the circle");}
if (c<10){
System.out.println("Point "+"("+x+","+y+")"+" is  in the circle");}}}

import java.util.*;
public class A5qno17{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
double g1,g2;
g2=n/2;
do{
g1=g2;
g2=(g1+(n/g1))/2.0;}
while (Math.abs(g1-g2)>0.000001);
System.out.println("The root of "+ n+" is ="+g2);}}
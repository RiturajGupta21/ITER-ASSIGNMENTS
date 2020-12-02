import java.util.*;
public class A5qno15{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the amount ");
int amt = sc.nextInt();
System.out.println("Enter the annual interest ");
int r = sc.nextInt();
System.out.println("Enter the number of months ");
int m = sc.nextInt();
double sum =0.0 , t=0, mr = r/1200.0;
for(int i=1;i<=m;i++){
sum =(amt+t)*(1+mr);
t=sum;}
System.out.println("The account becomes "+sum);}}
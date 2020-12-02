import java.util.*;
public class A7qno4 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
double a[]=new double[10];
int i;
System.out.println("Enter 10 values");
for(i=0;i<10;i++){
a[i]=in.nextDouble();}
double min=display(a);	  
System.out.println("The minumum number is:"+min);}
public static double display(double []a){
double min=a[0];
for(int i=0;i<10;i++){
if(a[i]<min)
min=a[i];}
return min;}}
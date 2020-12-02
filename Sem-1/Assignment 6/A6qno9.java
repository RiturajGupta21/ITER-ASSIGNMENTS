import java.util.Scanner;
public class A6qno9 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter 4 numbers ");
int a = sc .nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc .nextInt();
int e = lcm(b,d);
System.out.println("The lcm is ="+e);
double sum = (a*d+b*c)/e;
System.out.println("The sum is = "+sum);}
public static int lcm(int a ,int b){
int i = 2 , gcd=1;
while(i<=a&&i<=b){
while (a%i==0&&b%i==0){
gcd=gcd*i;
a =a/i;
b=b/i;}
i++;}
System.out.println("The gcd is = "+gcd);
int lcm =gcd * a *b;
return lcm;}}

import java.util.*;
public class A5qno9{
public static void main(String Args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value of x = ");
int x= sc.nextInt();	
System.out.println("Enter the value of n whose factorial is going to be taken ");
int n = sc.nextInt();
double o;
int i =1,f =1 ;
for(i=1;i<=n;i++){
f=f*i;}		
o= (Math.pow(x,f))/f;
System.out.println("The value of x = "+x);
System.out.println("The factorial is = "+f);
System.out.println("The output of the program is = "+o);
}}
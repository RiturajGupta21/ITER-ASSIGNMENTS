import java.util.*;
public class A3qno8{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ages as follow \n 1 Rahul \n 2 Ayush \n 3 Ajay");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if (a>b&&a>c){
System.out.println("Rahul is Elder");
}
else if (b>a&&b>c){
System.out.println("Ayush is Elder");
}
else{
System.out.println("Ajay is Elder");
}
}}
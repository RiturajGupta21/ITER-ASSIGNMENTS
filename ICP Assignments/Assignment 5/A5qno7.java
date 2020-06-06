import java.util.*;
public class A5qno7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of terms = ");
int t = sc.nextInt();
int odd=1,sum =0,addsum;
double sign;
for(int i=0;i<t;i++){
sign = Math.pow(-1,i);
addsum=odd*(int)sign;
sum = sum + addsum ;
odd = odd + 2;}
System.out.println("The sum of terms is = "+ sum);
}}

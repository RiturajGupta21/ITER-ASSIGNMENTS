import java.util.*;
public class A5qno5{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i , sum=0 ;
System.out.print("Enter numbers contained in the set of numbers  " );
int n = sc . nextInt();
for(i=1;i<=n;i++){
System.out.print("Enter the "+ i+" number = ");
int a = sc.nextInt();
sum = sum + a;}
double avg = sum / n;
System.out.println("The average number is = "+ avg);
System.out.println(" The sum of the numbers = "+sum);}}
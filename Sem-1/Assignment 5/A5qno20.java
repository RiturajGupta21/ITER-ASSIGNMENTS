import java.util.Scanner; 
public class A5qno20{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the integer factors to be displayed  = ");
int n = sc.nextInt();
int i =2 ;
int m=n;
while(m>0){
if (m%i==0){
System.out.print(i+ "  " );
m=m/i;}
else
i++;}}}

import java.util.Scanner;
public class A2qno4 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int r1,r2,r3;
r1=n%10;
n=n/10;
r2=n%10;
n=n/10;
r3=n%10;
System.out.println("Sum of digit ="+(r1+r2+r3));
}
}

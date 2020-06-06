import java.util.Scanner;
public class A3qno12{
public static void main (String args []){
System.out.println("enter three integers");
int n1,n2,n3;
Scanner sc = new Scanner (System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
if(n1<n2&&n1<n3&&n2<n3)
{
System.out.println(n1);
System.out.println(n2);
System.out.println(n3);
}
else if(n1>n2&&n1>n3&&n2>n3)
{
System.out.println(n3);
System.out.println(n2);
System.out.println(n1);
}
else if(n1<n2&&n1<n3&&n2>n3)
{
System.out.println(n1);
System.out.println(n3);
System.out.println(n2);
}
else if(n2>n1&&n2>n3&&n1>3)
{
System.out.println(n3);
System.out.println(n1);
System.out.println(n2);
}
else if (n3>n1&&n3>n2&&n1>n2)
{
System.out.println(n2);
System.out.println(n1);
System.out.println(n3);
}
}}
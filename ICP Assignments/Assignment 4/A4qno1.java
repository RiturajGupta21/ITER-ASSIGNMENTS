import java.util.Scanner;
public class A4qno1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the message");
String message=sc.next();
int i=1;
while(i<=10){
if(i==1)
System.out.println(i+"st"+message);
if(i==2)
System.out.println(i+"nd"+message);
if(i==3)
System.out.println(i+"rd"+message);
else
System.out.println(i+"th"+message);
i++;
}}}
import java.util.Scanner;
public class A3qno4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter letter capital or small,digit,special symbol");
char x=sc.next().charAt(0);
int c=x;
if(c>=65&&c<=90){
System.out.println("capital letter");
}
else if(c>=97&&c<=122){
System.out.println("small letter");}
else if(c>=48&&c<=57){
System.out.println("digit");}
else if((c>=0&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c<=127)){
System.out.println("special character");}
}}
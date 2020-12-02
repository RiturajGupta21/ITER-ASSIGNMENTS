import java.util.Scanner;
public class A3qno18{
public static void main (String args[]){
Scanner sc =new Scanner (System.in);
System.out.println("What is your gender (M or F):  first name, last name and age. ");
char x=sc.next().charAt(0);
String s=sc.next();
String s1=sc.next();
int age=sc.nextInt();
if (x=='F'){
if(age>=20){
System.out.println("Are you married "+s+"(y or n)?");
char c=sc.next().charAt(0);
if (c=='y'){
System.out.println("Then I shall call you Mrs. "+s+" "+s1);
}
else{ 
System.out.println("Then I shall call you Ms. "+s+" "+s1);
}}
else{
System.out.println("Then I shall call you "+s+" "+s1);
}}
else{
if(age>=20){
System.out.println("Then I shall call you Mr. "+s+" "+s1);}
else{
System.out.println("Then I shall call you  "+s+" "+s1);}
}}}
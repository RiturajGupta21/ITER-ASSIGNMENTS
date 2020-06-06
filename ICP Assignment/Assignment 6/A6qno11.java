import java.util.*;
public class A6qno11{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the Sentence or String "); 
String s = sc.next();
System.out.println("Enter the character which occurance is to be calculated ");
char ch = sc.next().charAt(0);
int num = count(s,ch);
System.out.println("The number of occurance is = "+num); }
public static int count(String str, char a){
String s = str;
char ch1 = a ;
int n = 0;
for(int i =0;i<s.length();i++){
if(s.charAt(i)==ch1)
n ++;}
return (n);}}
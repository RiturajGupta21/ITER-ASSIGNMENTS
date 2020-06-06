import java.util.*;
public class A6qno13{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the string to check for pallindrome ");
String s = sc.nextLine();
pallindrome(s);}
public static void pallindrome (String str){
String str1 = str , str2 ="";
for(int i =0;i<str1.length();i++){
str2 = str1.charAt(i)+str2;} 
System.out.println("The reverse String is = "+str2);
if(str2.equalsIgnoreCase(str))
System.out.println("The string is pallindrome ");
else 
System.out.println("The string is not pallindrome ");}}
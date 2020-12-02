import java.util.*;
public class A6qno14{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the password ");
String pass = sc.next();
boolean pa = password(pass);
if(pa==true)
System.out.println("The password is valid");
else 
System.out.println("The password is invalid ");}
public static boolean password(String a){
int cnt =0 ;
if(a.length()<8)
return false;
else{
for(int i = 0 ; i< a.length() ; i++){
if((a.charAt(i)>=48&&a.charAt(i)<=57)||(a.charAt(i)>=65&&a.charAt(i)<=90)||(a.charAt(i)>=97&&a.charAt(i)<=122)){
if(a.charAt(i)>=48&&a.charAt(i)<=57)
cnt = cnt + 1;}}
if(cnt>2)
return true;
else 
return false;}}}
import java.util.*;
public class A1qno5 {
public static boolean isOdd(int i){
while(i>0){
i=i-2;
if(i==1){
return true;
}}
return false;}
public static void main(String args[]) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter The number to be checked");
int i=sc.nextInt();
System.out.println(isOdd(i));
}}

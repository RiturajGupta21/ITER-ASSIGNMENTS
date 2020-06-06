import java.util.*;
public class A6qno3{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer ");
int x = sc.nextInt();
int y = reverse(x);
System.out.println("ITS REVERSE IS ="+y);
boolean  paali = isPalindrome(x,y);
if (paali == true)
System.out.println("ITS PALLINDROME");
else 
System.out.println("NO, SORRY  NOT A PALLINDROME");}
public static int reverse(int x){
int y = x , sum = 0 ;
while (y>0){
sum = sum + (y%10);
y = y/10;}
return (sum);}
public static boolean isPalindrome(int x,int y){
if (x==y)
return true;
else 
return false;}}
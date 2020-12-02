import java.util.*;
public class A7qno3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
int arr[]=new int[10];
System.out.println("Enter the which is to be find");
int n=sc.nextInt();
int c=0;
for (int i=0;i<10;i++){
arr[i]=sc.nextInt();
if(n==arr[i])
c++;}
for (int i=1;i<10;i++){
if(n==arr[i]){
System.out.println("Number is searched"+c);
}}}}
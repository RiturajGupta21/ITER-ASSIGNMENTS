import java.util.*;
public class A7qno5 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter value of n");
n=in.nextInt();
int a[]=new int [n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();}
int max=0;
int max1=0;
for(int i=0;i<n;i++){
if(a[i]>max){
max1=max;
max=a[i];}}
System.out.println("The second largest element in the array is:"+max1);}}
import java.util.*;
public class A7qno2{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int c[]=new int[100];
System.out.println("Enter the integers b/w 1 to 100");
int n=sc.nextInt();
while(n!=0) {
if(n>=1&&n<=100){
c[n-1]++;}
n=sc.nextInt();}
for(int i=0;i<100;i++) {
if(c[i]>0){
if(c[i]==1)
System.out.println((i+1)+" occurs "+c[i]+" time");	
else 
System.out.println((i+1)+" occurs "+c[i]+" times");}}}}
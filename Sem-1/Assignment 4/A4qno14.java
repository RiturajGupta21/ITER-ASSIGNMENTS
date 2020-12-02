import java.util.Scanner;
public class A4qno14{
public static void main(String args[]){
System.out.println("Enter the number");
Scanner sc=new Scanner (System.in);
int n=sc.nextInt(),c=1;
for(int i=1;i<n;i++){
int b=c<<i;
if(b>=n){
break;
}System.out.println(b);}}}

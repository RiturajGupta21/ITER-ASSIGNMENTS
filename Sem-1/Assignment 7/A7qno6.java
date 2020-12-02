import java.util.*;
public class A7qno6{
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0,j=n-1;i<n;i++,j--){
arr[i]=sc.nextInt();
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;}
for(int k=1;k<n;k++){
System.out.print(arr[k]);}}}
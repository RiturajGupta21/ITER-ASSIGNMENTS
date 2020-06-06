import java.util.*;
class A1qno7
{
public static void product(int a[],int c)
{
for(int i =0;i<c;i++){
for(int j =0;j<c;j++)
{
int pro =0;
if(a[i]==a[j])
continue;
pro =a[i]*a[j];
if(pro%2==1)
{
System.out.println("The product of"+a[i]+"and"+a[j]+"isOdd");
}}}}
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
int n=in.nextInt();
int arr[] =new int[n];
for(int i=0;i<n;i++)
{
arr[i] =in.nextInt();
}
product(arr,n);}}

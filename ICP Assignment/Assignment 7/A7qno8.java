import java.util.*;
public class A7qno8{ 
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int n=0,i,option,p=0,j,c; 
int a[]=new int[100];
do{
System.out.println("1. Creation of array");
System.out.println("2. Display array elements");
System.out.println("3. Insert at any position");
System.out.println("4. Delete from any position");
System.out.println("5. Exit");
System.out.println("enter option"); 
o=sc.nextInt();
switch(o){
case 1: System.out.println("enter size of array");
n=sc.nextInt();
System.out.println("enter array elements");     
for(i=0;i<n;i++)        
a[i]=sc.nextInt();     
break;      
case 2: System.out.println("Array elements");     
for(i=0;i<n;i++)        
System.out.println(a[i]);     
break; 
case 3: System.out.println("Enter position of new item to be inserted"); 
p=sc.nextInt();
System.out.println("Enter the value"); 
j=sc.nextInt();
for(i=n;i>pos;i--){
a[i]=a[i-1];}
a[p]=j;
n=n+1;
for(i=0;i<n;i++){     
System.out.println(a[i]); 
break;
case 4:
System.out.println("Enter position of item to be deleted");
p=sc.nextInt(); 
for(i=0;i<n;i++){
if(i==p)
continue;
System.out.println(a[i]);}
break;
case 5:
System.out.println("you have press the exit option"); break;
default:
System.out.println("wrong input! Please try again");} 
System.out.println("Do you want to continue?1.Yes 2.No"); 
c=sc.nextInt();}
while(c==1);
}}

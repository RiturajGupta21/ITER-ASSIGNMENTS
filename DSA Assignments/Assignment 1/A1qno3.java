import java.util.*;
public class A1qno3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
int n=sc.nextInt();
char a[]=new char[n];
for (int j=0;j<a.length;j++) {
a[j] =sc.next().charAt(0);}
Arrays.sort(a);		
for(int i=0;i<a.length;i++)
System.out.print(a[i]);
System.out.println();		
while(true){  
int x = findNextPermutation(a);
if(x==0)
break;
for(int i=0;i<a.length;i++)
System.out.print(a[i]);
System.out.println();}}
public static int findNextPermutation(char a[]){
int i = a.length - 1;
while (i > 0 && a[i - 1] >= a[i])
i--;
if (i <= 0)
return 0;
int j = a.length - 1;
while (a[j] <= a[i - 1])
j--;
char temp = a[i - 1];
a[i - 1] = a[j];
a[j] = temp;	    
j = a.length - 1;
while (i < j){
temp = a[i];
a[i] = a[j];
a[j] = temp;
i++;
j--;}
return 1;}}
import java.util.*;
public class A1qno4 {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt(),i;
String str[]= new String[n];
for(i=0;i<n;i++) {
str[i]=sc.nextLine();}
for(i=n-1;i>=0;i--) {
System.out.print(str[i]+" ");}}}
import java.util.*;
public class A6qno10{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the first characters ");
char ch1 = sc.next().charAt(0);
System.out.println("Enter the second character ");
char ch2 = sc.next().charAt(0);
System.out.println("Enter the numbers of characters entered per line ");
int num = sc.nextInt();
printChars(ch1,ch2,num);}
public static void printChars(char ch1, char ch2, int numberPerLine){
int i  , j ;
for(i=1;(int)ch1<=(int)ch2;i++){
System.out.print(ch1+" ");
j = (int)ch1+1;
ch1 = (char)j;
if(i%numberPerLine==0)
System.out.println("\n");}}}
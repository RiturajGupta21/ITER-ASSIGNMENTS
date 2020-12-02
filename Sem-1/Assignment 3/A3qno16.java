import java.util.*;
public class A3qno16{
public static void main(String args[]){
System.out.println("Enter the marks");
Scanner sc=new Scanner(System.in);
int g=sc.nextInt();
g=g/10;
switch(g){
case 10:
System.out.println("O");
case 9:
System.out.println("O");
break;
case 8:
System.out.println("A");
break;
case 7:
System.out.println("B");
break;
case 6:
System.out.println("C");
break;
case 5:
System.out.println("D");
break;
case 4:
System.out.println("E");
break;
case 3:
System.out.println("F");
break;
default :
System.out.println("F");
}}}
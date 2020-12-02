import java.util.*;
public class A3qno13{
public static void main (String args[]){
System.out.println("Enter month and year");
System.out.println("Enter 1 for jan, 2 for feb ... 12 for dec");
Scanner sc=new Scanner (System.in);
int m=sc.nextInt();
int y=sc.nextInt();
switch (m){
case 1:
System.out.println("Jan "+y+"had 31 days");
break;
case 2:
if(y%4==0&&y%100!=0||y%400==0)
System.out.println("Feb "+y+"had 29 days");
else
System.out.println("Feb "+y+"had 28 days");
break;
case 3:
System.out.println("Mar "+y+"had 31 days");
break;
case 4:
System.out.println("Apr "+y+"had 30 days");
break;
case 5:
System.out.println("May "+y+"had 31 days");
break;
case 6:
System.out.println("Jun "+y+"had 30 days");
break;
case 7:
System.out.println("Jul "+y+"had 31 days");
break;
case 8:
System.out.println("Aug "+y+"had 31 days");
break;
case 9:
System.out.println("Sep "+y+"had 30 days");
break;
case 10:
System.out.println("Oct "+y+"had 31 days");
break;
case 11:
System.out.println("Nov "+y+"had 30 days");
break;
case 12:
System.out.println("Dec "+y+"had 31 days");
break;
default:
System.out.println("Wrong Choice");
}}}
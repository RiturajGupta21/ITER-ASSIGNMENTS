import java.util.Scanner;
public class A3qno10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter todays day ");
int t=sc.nextInt();
System.out.println("Enter the number of days elapsed since today");
int e=sc.nextInt();
int z=(t+e)%7;
System.out.print("today is ");
switch (t){
case 1:
System.out.print("Mon");
break;
case 2:
System.out.print("Tue");
break;
case 3:
System.out.print("Wed");
break;
case 4:
System.out.print("Thu");
break;
case 5:
System.out.print("Fri");
break;
case 6:
System.out.print("Sat");
break;
case 0:
System.out.print("Sun");
break;
}
System.out.print(" and the future day is  ");
switch (z){
case 1:
System.out.print("Mon");
break;
case 2:
System.out.print("Tue");
break;
case 3:
System.out.print("Wed");
break;
case 4:
System.out.print("Thu");
break;
case 5:
System.out.print("Fri");
break;
case 6:
System.out.print("Sat");
break;
case 0:
System.out.print("Sun");
break;
}
}
}
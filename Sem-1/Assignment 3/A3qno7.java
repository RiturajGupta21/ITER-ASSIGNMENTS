import java.util.*;
public class A3qno7{
public static void main (String ars[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the x and y coordinates");
double x=sc.nextDouble();
double y=sc.nextDouble();
if(x>0&&y>0){
System.out.println("First quadrant");
}
else if(x<0&&y>0){
System.out.println("Second quadrant");
}
else if(x<0&&y<0){
System.out.println("Third quadrant");
}
else{
System.out.println("Fourth quadrant");
}
}
}
import java.util.*;
public class A3qno18 {
public static void tower (int i,char x,char y,char z) {
if(i>0) {
tower(i-1,x,z,y);
System.out.print(x+" "+y);
tower(i-1,z,y,x);
}
}
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number of disc");
int i=sc.nextInt();
System.out.println("Assign the name of pegs respectively");
char x=sc.next().charAt(0);
char y=sc.next().charAt(0);
char z=sc.next().charAt(0);
tower(i,x,y,z);
}
}

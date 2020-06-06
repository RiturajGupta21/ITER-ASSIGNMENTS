import java.util.*;
public class A2qno12 {
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("No of eggs");
int n=s.nextInt();
int d,l,g;
g=n/144;
n=n%144;
d=n/12;
l=n%12;
System.out.println("your number of eggs is"+g+"gross"+d+"dozens"+l);
}
}

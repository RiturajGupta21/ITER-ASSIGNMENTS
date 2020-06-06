import java.util.*;
public class A5qno6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numerator of the harmonic progression =");
int n = sc.nextInt();
int i = 1 ;
double HP=0.0;
for (i=1;i<=n;i++){
HP=HP+n/((1.0/i));}
System.out.println(" The Harmonic progression is = "+HP);
}}

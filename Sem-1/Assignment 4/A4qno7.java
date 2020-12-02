public class A4qno7{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
double s=0.0;
for (int i=1;i<=n;i++){
double r=Math.random();
System.out.println(i+" Random number "+r);
s=s+r;
}
System.out.println("Sum ="+s);
System.out.println("Average ="+(s/n));
}}



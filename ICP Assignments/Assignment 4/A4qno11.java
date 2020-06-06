public class A4qno11{
public static void main (String args[]){
int a=0,b=0;
for (int i=1;i<=100;i++){
a=a+(i*i);
b=b+i;
}
System.out.print("the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.");
System.out.print(" "+(b*b));
System.out.print("-"+a);
System.out.print("="+((b*b)-a));
}}

public class A2qno23 {
public static void main(String[] args) {
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int max=Math.max(a, b);
int max1=Math.max(max, c);
int min=Math.min(a, b);
int min1=Math.min(min, b);
int mid =(a+b+c)-(max1+min1);
System.out.print(" "+min1);
System.out.print(" "+mid);
System.out.print(" "+max1);
}
}

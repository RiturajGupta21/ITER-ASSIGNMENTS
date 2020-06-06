public class A2qno17 {
public static void main(String[] args) {
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
boolean s=a>=(b+c)||b>=(a+c)||c?true:false;
System.out.println(s);
}
}

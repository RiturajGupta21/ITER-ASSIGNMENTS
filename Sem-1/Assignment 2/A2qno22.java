public class A2qno22 {
public static void main(String[] args) {
double t=Double.parseDouble(args[0]);
double p=Double.parseDouble(args[1]);
double r=Double.parseDouble(args[2]);
double mlp=p*Math.exp((r/1200)*t);
System.out.println("Monthly loan payment="+mlp);
}
}

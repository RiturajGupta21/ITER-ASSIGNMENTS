import java.util.Scanner; 
class QuadraticEquation { 
	private double a, b, c; 
	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c; 
		} 
	public double getA() {
		return a; 
		} 
	public double getB() {
			return b; 
			}
	public double getC() {
		return c;
		}
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
		} 
	public double getRoot1() 
	{
		return getDiscriminant() < 0 ? 0 : ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); 
		}
	public double getRoot2() {
		return getDiscriminant() < 0 ? 0 : ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
}
} public class A9qno3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, c: "); 
		double a = sc.nextDouble(); 
		double b = sc.nextDouble();
		double c = sc.nextDouble();
QuadraticEquation q = new QuadraticEquation(a, b, c);
System.out.print("The equation has ");
if(q.getDiscriminant() < 0) 
	System.out.println("no real roots"); 
else if (q.getDiscriminant() > 0) { 
	System.out.println("two roots " + q.getRoot1() + " and " + q.getRoot2());
	} 
else {
	System.out.println("one root " + (q.getRoot1() > 0 ? q.getRoot1() : q.getRoot2())); 
	}
}
}
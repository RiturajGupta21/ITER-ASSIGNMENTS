import java.util.*;
class point{
	int x,y;
	void setpoint() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the coordinate");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void finddistance(point p1,point p2) {
		int a=p1.x-p2.x;
		int b=p2.y-p2.y;
		double d=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.println(d);
	}
}
public class A1qno11 {

	public static void main(String[] args) {
		point p1=new point();
		point p2=new point();
		point p3=new point();
		p1.setpoint();
		p2.setpoint();
		p3.finddistance(p1, p2);
	}

}

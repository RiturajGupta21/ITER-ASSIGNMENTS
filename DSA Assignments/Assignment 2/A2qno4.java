import java.util.Scanner;
class PointType
{
	double x,y;
	void setData_Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void display_Point()
	{
		System.out.println("Point :=("+x+" ,"+y+")");
	}
	double getX()
	{
		return(x);
	}
	double getY()
	{
		return(y);
	}
}
class CircleType extends PointType
{
	double radius;
	double radius(PointType ob1,PointType ob2)
	{
		radius=Math.sqrt((Math.pow(ob1.x-ob2.x, 2))+(Math.pow(ob1.y-ob2.y, 2)));
		return(radius);
		
	}
	double area()
	{
		
		double a=Math.PI*Math.pow(radius, 2);
		return(a);
	}
	double circumference()
	{
		double c=2*Math.PI*radius;
		return(c);
	}
}
public class A2qno4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		CircleType ob=new CircleType();
		CircleType ob1=new CircleType();
		CircleType ob2=new CircleType();
		System.out.println("1st Point Co-ordinate:-");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		ob1.setData_Point(x,y);
		System.out.println("Centre Point Co-ordinate:-");
		double xx=sc.nextDouble();
		double yy=sc.nextDouble();
		ob2.setData_Point(xx,yy);
		System.out.println("Co-ordinate:=");
		ob1.display_Point();
		System.out.println("Centre Co-ordinate:=");
		ob2.display_Point();
		double r=ob.radius(ob1,ob2);
		System.out.println("Radius="+r);
		double a=ob.area();
		System.out.println("Area="+a);
		double c=ob.circumference();
		System.out.println("Circumference="+c);
	}
}

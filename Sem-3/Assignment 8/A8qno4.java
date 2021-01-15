import java.util.*;
abstract class Shape{
	double length,base,height;
	float radius,width;
	Shape(double l,float w){
		length=l;
		width=w;
	}
	Shape(double b,double h){
		base=b;
		height=h;
	}
	Shape(float r){
		radius=r;
	}
}
class Rectangle extends Shape{
	Rectangle(double l,float w){
		super(l,w);
	}
	void Area(){
		double a=length*width;
		System.out.println("Area of Square="+a);
	}
}
class Triangle extends Shape{
	Triangle(double b,double h){
		super(b,h);
	}
	void Area(){
		double a=0.5*base*height;
		System.out.println("Areaof Triangle="+a);
	}
}
class Circle extends Shape{
	Circle(float r){
		super(r);
	}
	void Area(){
		double a=Math.PI*Math.pow(radius, 2);
		System.out.println("Area of circle="+a);
	}
}
public class A8qno4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width of Rectangle");
		double l=sc.nextDouble();
		float w=sc.nextFloat();
		Rectangle ob1=new Rectangle(l,w);
		System.out.println("Enter the breadth and height of triangle");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
	    Triangle ob2=new Triangle(b,h);
	    System.out.println("Enter the radius of circle");
		float r=sc.nextFloat();
	    Circle ob3=new Circle(r);
	    ob1.Area();
	    ob2.Area();
	    ob3.Area();
	}
}
	

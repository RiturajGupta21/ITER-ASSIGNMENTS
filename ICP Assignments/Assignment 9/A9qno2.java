class Rectangle { 
	double width; double height;
Rectangle() { 
	width = 1; height = 1; } 
Rectangle(double width1, double height1) {
	width = width1; 
	height = height1; 
	}
double getArea() { 
	return width * height; 
	}
double getPerimeter() { 
	return 2 * (width + height); 
	}
} public class A9qno2 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
System.out.println("Rectangle 1"); 
System.out.println("Width" + rectangle1.width); 
System.out.println("Height" + rectangle1.height);
System.out.println("Area" + rectangle1.getArea());
System.out.println("Perimeter" + rectangle1.getPerimeter());
System.out.println("Rectangle 2"); 
System.out.println("Width" + rectangle2.width);
System.out.println("Height" + rectangle2.height);
System.out.println("Area" + rectangle2.getArea());
System.out.println("Perimeter" + rectangle2.getPerimeter());
}
}
import java.util.Scanner;

class Student
{
	private String name ;
	private int roll;
	private double marks;
	Scanner sc = new Scanner(System.in);
	void setData()
	{
		System.out.println("Enter the name ");
		String n = sc.nextLine();
		name = n;
		System.out.println("Enter the roll number ");
		int r = sc.nextInt();
		roll = r;
		System.out.println(("Enter the Marks of the student "));
		double m = sc.nextDouble();
		marks = m;
	}
	void display()
	{
		System.out.println("The name of the student is = "+name );
		System.out.println("The roll number is = "+roll);
		System.out.println("The marks is = "+marks );
		
	}
	double getMarks()
	{
		return marks;
	}
}
	
	public class A1qno10
	{
		public static void main (String Args[])
		{
			Student ob1 = new Student();
			Student ob2 = new Student();
			Student ob3 = new Student();
			ob1.setData();
			ob2.setData();
			ob2.setData();
			ob1.display();
			ob2.display();
			ob3.display();
			
		}
	}
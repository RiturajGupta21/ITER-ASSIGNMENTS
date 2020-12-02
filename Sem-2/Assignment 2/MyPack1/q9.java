import java.util.Scanner;
public class q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner scc=new Scanner(System.in);
		Student ob1=new Student();
		Student ob2=new Student();
		System.out.println("Enter 1st Student Details:-");
		System.out.println("Name?");
		String n1=scc.nextLine();
		System.out.println("Roll?=");
		int r1=sc.nextInt();
		System.out.println("Marks in 2 subject respectively:-");
		double m1=sc.nextDouble();
		double m2=sc.nextDouble();
		ob1.input(n1, r1, m1, m2);
		System.out.println("Enter 2nd Student Details:-");
		System.out.println("Name?");
		String n2=scc.nextLine();
		System.out.println("Roll?=");
		int r2=sc.nextInt();
		System.out.println("Marks in 2 subject respectively:-");
		double m21=sc.nextDouble();
		double m22=sc.nextDouble();
		ob2.input(n2, r2, m21, m22);
		System.out.println("Student 1 Details:=");
		ob1.output();
		System.out.println("Student 2 Details:=");
		ob2.output();
		}

}

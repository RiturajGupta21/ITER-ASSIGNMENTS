import java.util.Scanner;
class Person
{
	String name;
	int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
}

class Student extends Person
{
	String course;
	int rollnumber;
	double marks;
	Student(String n,int a,String c,int r,double m)
	{
		super(n,a);
		course=c;
		rollnumber=r;
		marks=m;
	}
	void display()
	{
		super.display();
		System.out.println("Course="+course);
		System.out.println("Student Roll Number="+rollnumber);
		System.out.println("Marks="+marks);
	}
}
class Teacher extends Person
{
	String sub_assigned;
	String contact_hour;

	Teacher(String n,int a,String s,String c)
	{
		super(n,a);
		sub_assigned=s;
		contact_hour=c;
	}
	void display()
	{
		super.display();
		System.out.println("Subject Assigned="+sub_assigned);
		System.out.println("Contact Hours="+contact_hour);
	}
}
public class A2qno5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner scc=new Scanner(System.in);
		System.out.println("Student Name:-");
		String n=scc.nextLine();
		System.out.println("Student Age:-");
		int a=sc.nextInt();
		System.out.println("Student Course:-");
		String c=scc.nextLine();
		System.out.println("Student Roll no.:-");
		int r=sc.nextInt();
		System.out.println("Student Marks:-");
		double m=sc.nextDouble();
		Student ob1=new Student(n,a,c,r,m);
    	System.out.println("Teacher Name:-");
		String nt=scc.nextLine();
		System.out.println("Teacher Age:-");
		int at=sc.nextInt();
		System.out.println("Subject Assigned:-");
		String s=scc.nextLine();
		System.out.println("Contact hours:-");
		String ch=scc.nextLine();
		Teacher ob2=new Teacher(nt, at,s,ch);
		ob1.display();
		ob2.display();
	}
}

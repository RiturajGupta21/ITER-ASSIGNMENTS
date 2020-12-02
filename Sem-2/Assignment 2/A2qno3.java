import java.util.Scanner;

class Student
{
	int rollnumber;
	String name;
	String course;
	void input_Student(int r,String n,String c)
	{
		rollnumber=r;
		name=n;
		course=c;
	}
	void display_Student()
	{
		System.out.println("Roll Numner :="+rollnumber);
		System.out.println("Name :="+name);
		System.out.println("Course :="+course);
	}
}
class Exam extends Student
{
	double mark1,mark2,mark3;
	void input_Marks(double m1,double m2,double m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void display_Result()
	{
		super.display_Student();
		System.out.println("Mark1:="+mark1);
		System.out.println("Mark2:="+mark2);
		System.out.println("Mark3:="+mark3);
	}
}
public class A2qno3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner scc=new Scanner(System.in);
	Exam ob[]=new Exam[5];
	int i;
	for(i=0;i<5;i++)
	{
		ob[i]=new Exam();
		System.out.println("Enter "+(i+1)+" Student details:=");
		System.out.println("Roll:=");
		int r=sc.nextInt();
		System.out.println("Name:=");
		String n=scc.nextLine();
		System.out.println("Course:=");
		String c=scc.nextLine();
		ob[i].input_Student(r,n,c);
		System.out.println("Enter marks of 3 subject respectively:=");
		double m1=sc.nextDouble();
		double m2=sc.nextDouble();
		double m3=sc.nextDouble();
		ob[i].input_Marks(m1,m2,m3);
	}
	for(i=0;i<5;i++)
	{
		System.out.println("Student "+(i+1));
		ob[i].display_Result();
	}
    }
}

import java.util.*;
class MarksOutOfBoundException extends Exception
{
	MarksOutOfBoundException(String s)
	{
		System.out.println(s);
	}
	public String toString()
	{
		return "Invalid Mark ";
	}
	
}
class Student 
{
	 String name ;
	 double mark;
	 Student(String name , double mark)
	 {
		 this.name = name ;
		 this.mark = mark ; 
	 }
	 public String toString()
	 {
		 return "Student [Name="+name+",Marks ="+mark+"]";
	 }
}
public class A3qno3 
{
	public static void main (String Args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = 0;
		try 
		{
			System.out.println("Input Marks  ");
			m = sc.nextInt();
			System.out.println("Enter the name of the student ");
			String  n = sc.next();
			if(m<0 || m>100)
			{
				throw new MarksOutOfBoundException("Wrong");
			}
			else 
			{
				Student s = new Student (n,m);
				System.out.println(s);
			}
		}
		catch (Exception e )
		{
			System.out.println(e);
		}
		sc.close();
	}
	
}

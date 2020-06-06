import java.util.*;
class Student { 
	String name; int roll, mark;
void setData() 
{
	Scanner sc=new Scanner (System.in); 
	name=sc.nextLine();
	roll=sc.nextInt(); 
	mark=sc.nextInt(); } 
void display() 
{
	System.out.println(name+" "+ roll +" "+ mark); }
} public class A9qno1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
System.out.println("Enter 1st student details: name, roll, mark:"); 
s1.setData(); 
System.out.println("Enter 2nd student details: name, roll, mark:"); 
s2.setData(); 
System.out.println("Enter 3rd student details: name, roll, mark:");
s3.setData();
System.out.println("The student details are"); 
s1.display(); 
s2.display(); 
s3.display();
}
}

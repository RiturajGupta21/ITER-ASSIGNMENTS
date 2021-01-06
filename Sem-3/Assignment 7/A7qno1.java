import java.util.*;
class Student{
	String Name;
	int age;
	int roll;
	Student(String Name,int age,int roll){
		this.Name=Name;
		this.age=age;
		this.roll=roll;
	}
}
public class A7qno1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList <Student> ll=new LinkedList<Student>();
		System.out.println("Enter the number of Students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(new Student(sc.next(),sc.nextInt(),sc.nextInt()));
		}
		for(Student s:ll) {
			System.out.println(s.Name+" "+s.age+" "+s.roll);
		} 
	}
}

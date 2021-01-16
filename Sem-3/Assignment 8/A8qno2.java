import java.util.*;
public class A8qno2 {
	String name;
	int age,roll;
	public A8qno2(String name,int age,int roll) {
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	public String toString() {
		return  name + "," + age + ","+roll;
		}
	public boolean equals(Object o) {
		if(o==null)
			return false;
		if(o==this)
			return true;
		if(getClass()!=o.getClass())
			return false;
		A8qno2 a=(A8qno2) o;
		return (this.toString()==a.toString());
	}
	public static void main(String[] args) {
		A8qno2 x=new A8qno2("Rituraj",19,14);
		A8qno2 y=new A8qno2("Rituraj",19,14);
		//Reflexive
		if(x.equals(x)) {
			System.out.println("Its reflexive");
		}
		else {
			System.out.println("Its not reflexive");
		}
		//Symmetric
		if(x.equals(y)==y.equals(x)) {
			System.out.println("Its Symmetric");
		}
		else {
			System.out.println("Its not Symmetric");
		}
		//transitive
		A8qno2 z=new A8qno2("Rituraj",19,14);
		boolean c1=(x.equals(y)&&y.equals(z));
		if(c1==x.equals(z)) {
			System.out.println("Its transitive");	
		}
		else {
			System.out.println("Its not transitive");
		}
		//Consistent
		int i=0;
		System.out.println("Enter number of time for which loop have to be run");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		while(i<j) {
			boolean b=x.equals(y);
			if(b==x.equals(y)) {
				System.out.println("Its repeatable");
				b=x.equals(y);
			}
			else {
				System.out.println("Its not repeatable");
			}
			i++;
		}
		//Null
		if(x.equals(null)==false) {
			System.out.println("Its cautious");
			}
		else {
			System.out.println("Its not cautious");
		}
	}
}

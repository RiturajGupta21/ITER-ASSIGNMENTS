import java.util.*;
public class A8qno1 {
	String name;
	int age,roll;
	public A8qno1(String name,int age,int roll) {
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	public String toString() {
		return  name + "," + age + ","+roll;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A8qno1 arr[]=new A8qno1[2];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter name age and roll followed by a space");
			arr[i]=new A8qno1(sc.next(),sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

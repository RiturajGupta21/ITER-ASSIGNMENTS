import java.util.*;
class student {
	String name;
	int roll;
	double mark;
	void setData(String str,int r,double m) {
		name=str;
		roll=r;
		mark=m;
	}
	void display(){
		System.out.println(name+roll+mark);
	}
}
public class A1qno9 {

	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		s1.setData("XYZ", 5, 100);
		s2.setData("ABC", 10, 99);
		s3.setData("PQR", 15, 98);
		s1.display();
		s2.display();
		s3.display();
	}

}

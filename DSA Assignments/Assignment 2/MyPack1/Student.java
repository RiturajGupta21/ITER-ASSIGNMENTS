package MyPack1;
import MyPack2.*;
public class Student extends Test 
{
	String name;
	int roll;
	public void input(String n,int r,double m1,double m2)
	{
		super.input(m1, m2);
		name=n;
		roll=r;
	}
	public void output()
	{
		super.output();
		System.out.println("Name:="+name);
		System.out.println("Roll:="+roll);
	}
	
	
}

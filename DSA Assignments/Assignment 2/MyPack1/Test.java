package MyPack1;
import MyPack2.*;
public class Test implements Sports
{
	double mark1,mark2;
	void input(double m1,double m2)
	{
		mark1=m1;
		mark2=m2;
	}
	void output()
	{
		
		System.out.println("Mark1="+mark1);
		System.out.println("Mark2="+mark2);
	}
	
	public void total()
	{
		System.out.println("Grand Total="+(mark1+mark2));
	}
	public void Score1() 
	{
		System.out.println("Total Mark="+(mark1+mark2));
	}
	public void Score2() 
	{
		System.out.println("Total Mark="+(mark1+mark2));
	}
}

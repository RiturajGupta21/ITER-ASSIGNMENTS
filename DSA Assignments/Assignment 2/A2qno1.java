import java.util.Scanner;
class Commission
{
	double sales;
	Commission(double s)
	{
		sales=s;
	}
	double getCommission()
	{
		double c=0.0;
		if(sales<500)
			c=(2*sales)/100;
		else if(sales>=500&&sales<5000)
			c=(5*sales)/100;
		else if(sales>=5000)
			c=(8*sales)/100;
		return(c);
	}
}
public class A2qno1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total amount of sales:-");
		double s=sc.nextDouble();
		if(s>=0)
		{
		Commission ob=new Commission(s);
		double c=ob.getCommission();
		System.out.println("Commission payable:-"+c);
	    }
		else
		{
			System.out.println("Invalid Input.");
		}
    }
}

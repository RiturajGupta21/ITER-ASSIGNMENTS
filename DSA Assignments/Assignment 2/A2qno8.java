import java.util.Scanner;
interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee
{
	int empID;
	String fName,lName;
	double salary;
	Employee(int id,String f,String l,double s)
	{
		empID=id;
		fName=f;
		lName=l;
		salary=s;
		
	}
}
class Manager extends Employee implements EmpInterface
{
	double bonus;
	Manager(int id,String f,String l,double s)
	{
		super(id,f,l,s);
	}
	public void displayEmp()
	{
		System.out.println("Emp ID="+empID);
		System.out.println("Name="+fName+" "+lName);
		System.out.println("Salary="+salary);
		if(bonus>0)
			System.out.println("Bonus="+bonus);
	}
	public void giveBonus(double amount)
	{
		if(amount>0)
		bonus=amount;
	}
}
public class A2qno8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner scc=new Scanner(System.in);
		Manager ob[]=new Manager[3];
		int i;
		for(i=0;i<3;i++)
		{
		System.out.println((i+1)+" Emp ID:=");
		int empId=sc.nextInt();
		System.out.println("First Name:=");
		String fName=scc.nextLine();
		System.out.println("Last Name:=");
		String lName=scc.nextLine();
		System.out.println("Salary:=");
		double salary=sc.nextDouble();
		ob[i]=new Manager(empId,fName,lName,salary);
		System.out.println((i+1)+" Emp Bonus Amount");
		double amount=sc.nextDouble();
		ob[i].giveBonus(amount);
	    }
		for(i=0;i<3;i++)
		{
			ob[i].displayEmp();
		}
	}
}

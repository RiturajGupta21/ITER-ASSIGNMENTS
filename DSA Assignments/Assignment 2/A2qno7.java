import java.util.Scanner;
interface inf1
{
	void display();
	int count();
}
class ABC implements inf1
{
	static int maxcount;
	String name;
	ABC(String n)
	{
		name=n;
	}
	public void display()
	{
		System.out.println("Name:="+name);
		maxcount=count();
		System.out.println("No. of characters excluding space:="+maxcount);
	}
	public int count()
	{
		int l=name.length();
		int i,c=0;
		char ch;
		for(i=0;i<l;i++)
		{
			ch=name.charAt(i);
			if(ch==' ')
			{
				c=c+1;
			}
		}
		l=l-c;
		return(l);
	}
	
}
public class A2qno7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name?");
		String n=sc.nextLine();
		ABC ob=new ABC(n);
		ob.count();
		ob.display();
	}
}
	

import java.util.*;
public class A3qno11 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers whose GCD you want to take ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The GCD of two numbers are ="+ GCD(a,b));
	}
	public static int GCD (int a , int b )
	{
		if(b==0)
		{
			return a;
		}
		else 
		{
			int r = a%b;
			a=b;
			b=r;
			return GCD(a,b);
		}
	}
}

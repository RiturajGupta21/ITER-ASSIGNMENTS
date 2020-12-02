import java.util.*;
public class A3qno8 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("For x to the power n First enter x then enter n ");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int fact = mul(x,n);
		System.out.println("The x to the power n = "+fact);
		
	}
	public static int mul(int x , int y)
	{
		if(x==0)
			return 0;
		else if(y==0)
			return 1;
		else 
		{
			int f = x*mul(x,y-1);
			return f;
		}
	}
}

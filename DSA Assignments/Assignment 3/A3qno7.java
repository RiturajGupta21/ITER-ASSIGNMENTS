import java.util.*;
public class A3qno7 
{
	public static void main (String []Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factoria; you want to take ");
		int n = sc.nextInt();
		int f = fact(n,1);
		System.out.println("The factorial of the number is = "+f);
	}
	public static int fact(int n , int i)
	{
		if(n==i)
			return i;
		else 
		{
			int f = i*fact(n,i+1);
			return f;
		}
	}
}

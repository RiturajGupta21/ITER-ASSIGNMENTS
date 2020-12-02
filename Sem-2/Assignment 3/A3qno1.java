import java.util.*;
public class A3qno1 
{
	public static void main(String []Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number ");
		int n = sc.nextInt();
		try 
		{
			if (n<0)
				throw new NumberFormatException("Lucky number cannot be -ve ");
			else 
				System.out.println("Your lucky number is = "+n);
		}
		catch (Exception e )
		{
			System.out.println(e);
		}
		sc.close();
	}
}

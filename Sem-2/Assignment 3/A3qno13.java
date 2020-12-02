import java.util.*;
public class A3qno13 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number whose binary you wnat to find ");
		int  n= sc.nextInt();
		String binary = binary(n,"");
		System.out.println("The binary is = "+binary);
	}
	public static String binary(int n ,String bin)
	{
		if(n==0)
			return bin;
		else 
		{
			int r = n%2;
			bin  = r+bin;
			return binary (n/2,bin);
		
		}
	}
}

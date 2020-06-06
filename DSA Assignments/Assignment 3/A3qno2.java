import java.util.*;
public class A3qno2 
{
	public static void main (String Args[])
	{
		Scanner sc = new Scanner (System.in);
		try 
		{
			String a[] = {"Red" , "Green" , "Blue" , "Null" , "Black" };
			System.out.println("Enter the colour number (0-4)");
			int x = sc.nextInt();
			System.out.println("Color name length is  = "+a[x].length());
		
		}
			catch (ArrayIndexOutOfBoundsException e )
			{
				System.out.println(e);
			}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		sc.close();
	
	}
}

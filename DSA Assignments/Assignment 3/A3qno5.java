import java.util.*;
public class A3qno5 
{
	public static < E > void printArray( E[] inputArray)
	{
		for(int i = 0 ;i<inputArray.length ; i++)
		{
			System.out.println(inputArray[i]+"  ");
		}
	}
	public static void main(String Args[])
	{
		Integer a[] = {1,2,3,4,5,6,7,8,9};
		Double b [] = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
		String c[] = {"Hello World ", "I am done with you ", "Bye now"};
		printArray(a);
		printArray(b);
		printArray(c);
	}
}

public class A3qno6 
{
	public static <T> int count(T[] array, T item) 
	{
		int c= 0;
		for(int i = 0;i<array.length ;i++)
		{
			if(array[i]==item)
				c++;
		}
		return c;
	}
	public static void main(String Args[])
	{
		Integer a[] = {1,2,3,4,5,6,7,8,9};
		Character ch[] = {'a','b','c','d','e','f','g','h','i'};
		Double d[] = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
		System.out.println("Count the occurance of an integer array ");
		int c = count(a,3);
		System.out.println(c);
		System.out.println("Count the occurance of the character array");
		c = count(ch,'b');
		System.out.println(c);
		c = count(d,1.1);
		System.out.println(c);
	}
	/*public static <T extends Comparable<T>> int count(T [] arr , T ele)
	{
		int c = 0;
		for(int i = 0 ; i<arr.length ;i++)
		{
			if(arr[i].compareTo(ele)==0)
			{
				c++;
			}
		}
		return c;
			
	}*/
}

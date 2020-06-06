import java.util.*;
public class A7qno11
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array ");
		int a[] = new int [10];
		for(int i = 0 ;i< a.length ; i++)
			a[i] = sc.nextInt();
		BubbleSort(a);
	}
	public static void BubbleSort(int a[])
	{
		int i , j ,k ;
		for(i=0 ; i<a.length-1; i++)
		{
			for(j= 0 ; j<(a.length-i-1); j++)
			{
				if(a[j]>a[j+1])
				{
				int t = a[j];
				a[j] = a[j+1];
				a[j+1] = t ;	
				}
				
			}
		}
		for(k=0;k<a.length ; k++)
			System.out.print(a[k]+"\t");

	}
}
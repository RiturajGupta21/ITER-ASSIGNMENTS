import java.util.*;
public class A7qno12
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array ");
		int a[] = new int[10];
		for(int i =0 ;i<a.length ; i++)
			a[i]=sc.nextInt();
		SelectionSort(a);
	}
	public static void  SelectionSort(int a[])
	{
		int i , j;
		for(i=0;i<a.length-1;i++)
		{
			int min = i;
			for( j = i+1 ;j<a.length ; j++)
			{
				if(a[min]>a[j])
				min = j;
					int t = a[min];
					a[min] = a[i];
					a[i] = t; 
				
			}
		}
		System.out.println("The sorted array is ");
		for(int k = 0;k<a.length ; k++)
			System.out.print ( a[k]+"  ");
	}


}
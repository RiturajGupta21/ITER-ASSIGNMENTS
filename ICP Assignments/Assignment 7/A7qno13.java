import java.util.*;
public class A7qno13
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements in the array ");
		int n  = sc .nextInt();
		System.out.println("Enter the array ");
		int a[] = new int [n];
		for(int i=0;i<a.length ; i++)
			a[i]=sc.nextInt();
		boolean  b = isSorted(a);
		if(b==true)
			System.out.println("The list is already sorted ");
		else 
			System.out.println("The list is not sorted ");

	}
	public static boolean isSorted(int a[])
	{
		int k ;
		int b[] = new int[a.length];
		for( k=0;k<a.length;k++)
			b[k]=a[k];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<(a.length-i-1);j++)
			{
				if(b[j]>b[j+1])
				{
					int t = b[j];
					b[j]=b[j+1];
					b[j+1]=t;
				}
			}
		}
		int flag =0;
		for(int l= 0 ;l<a.length ; l++)
		{
			if(b[l]!=a[l])
				flag =1;
		}
		if(flag ==1)
			return false ;
		else 
			return true;
	}
}
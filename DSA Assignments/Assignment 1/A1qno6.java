import java.util.*;
public class A1qno6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a upto what number you want to print ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array of numbers ");
		for(int i = 0 ;i<n;i++)
			a[i]=sc.nextInt();
		int min = Smallest(a);
		int mini = a[0];
		for(int i= 0;i<n;i++)
		{
			mini  = Math.min(mini,a[i]);
		}
		if(mini==min)
			System.out.println("They both are same numbers ");
		else System.out.println("THey both are different numbers ");
		sc.close();

	}
	public static int Smallest(int n[])
	{
		int m =0;
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]>n[i+1])
			{
				m = n[i+1];
			}
			else m = n[i];
		}

		return m ;
	}
}
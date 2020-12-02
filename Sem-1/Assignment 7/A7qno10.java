import java.util.*;
public class A7qno10
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ten numbers in the : ");
		int a[] = new int [10];
		int b[] = new int [10];
		for(int i = 0 ;i < a.length ; i++)
			a[i] = sc.nextInt();
		 eliminateDuplicates(a);
}		
	public static void eliminateDuplicates(int a[])
	{
		
		int k = 0 ;
		int n = a.length;
		int j;
		for(int i = 0 ; i<n-1 ; i++)
		{
			for( j = i+1 ; j<n ; j++)
			{
				if(a[i]==a[j])
				{
					for(k = j ; k<n-1 ; k++)
					{
						a[k]=a[k+1];
					}
			n--;
			
		}
	}
		
	}
	for( j = 0 ; j<n ; j++)
			System.out.print(a[j]+" ");
	
	

}
}

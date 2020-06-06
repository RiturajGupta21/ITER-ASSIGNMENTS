import java.util.*;
public class A7qno9
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 10 numbers to be inputed in the array ");
		double  a[] = new double [10];
		for(int i = 0 ; i < a.length ; i++ )
		{
			a[i] = sc.nextDouble();
		}
		double m = mean(a);
		double n = deviation(a);
		System.out.println("The mean is "+m);
		System.out.println("The deviation is "+n);
	}
	public static double mean(double a[])
	{
		double sum = 0.0;
		for(int j = 0 ; j < a.length ; j++)
			sum = sum + a[j];
		double avg = sum/10.0;
		return (avg);
	}
	public static double deviation(double a[])
	{
		double b = mean(a);
		double dev = 0.0;
		for(int i = 0 ;i < a.length ; i++)
		{
			dev = dev + (a[i]-b)*(a[i]-b);
		}
		double e = Math.sqrt(dev / (a.length -1));
		return (e) ;

	}
}
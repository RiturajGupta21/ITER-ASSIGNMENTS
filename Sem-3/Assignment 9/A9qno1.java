import java.io.*;
public class A9qno1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int n=Integer.parseInt(br.readLine());
		double arr[]=new double[n];
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=Double.parseDouble(br.readLine());
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+sum/n);
	}

}

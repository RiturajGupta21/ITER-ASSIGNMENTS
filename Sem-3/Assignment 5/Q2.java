import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int cnt=0;
		double a2 =(double)c/2,a1;
		do {
		a1 = a2 ;
		a2 = ((n-1)*a1+(c/Math.pow(a1,n-1)))/n;
		System.out.println("No of Step"+cnt+" value "+a2);
		cnt++;
		}
		while(Math.abs(a2-a1)>0||cnt==99);
		System.out.printf("%.6f",a2);
	}
}
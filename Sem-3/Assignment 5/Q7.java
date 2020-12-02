import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		in.close();
		int i=1;
		while(true){
			System.out.println("Input "+n);
			long r=rev(n,0);
			System.out.println("rev "+r);
			long sum=r+n;
			long sumr=rev(sum,0);
			if(sum==sumr){
				System.out.println("Sum "+sum+" is Palindromic");
				break;
			}
			else{
				System.out.println(i++ + "-Sum "+sum+" is Not Palindromic");
				n=sum;
			}
		}
	}
	private static long rev(long n, long r){
		if(n==0)
			return r;
		else{
			r=r*10+n%10;
			return rev(n/10,r);
		}
	}
}

import java.util.*;
public class A1qno3 {
	static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
	}

}

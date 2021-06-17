import java.util.*;
public class A2qno7 {
	public static  List<Integer> generatePrimes(int n){
		List<Integer> primes=new ArrayList<>();
		int c=0;
		for(int i=2;i<=n;i++) {
			c=0;
		  for(int j=2;j*j<=i;j++) {
		    if(i%j==0)
		      c++;
		  }
		  if(c==0) {
		    primes.add(i);
		  }
		}
		return primes;
	}
	public static void main(String[] args) {
		System.out.println(generatePrimes(10));
	}

}

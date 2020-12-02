import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),p = 0,r,o=n;
		for( ;n!= 0;n/= 10 ){
            r=n% 10;
             p=p*10+r;
        }
		if(o==p) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}

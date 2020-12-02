import java.util.*;
public class A5qno5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(String str1:str.split("\\.")) {
			int n=Integer.parseInt(str1);
			int sum=0;
			for(int i=n;i>0;i/=10) {
				sum+=i%10;
			}
			System.out.println(sum);
		}
	}

}

import java.util.*;
public class A3qno22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int n=str.length();
		str=str.concat(str1);
		str1=str.substring(0,n);
		str=str.substring(n);
		System.out.println(str);
		System.out.println(str1);
	}
}

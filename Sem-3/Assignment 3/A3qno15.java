import java.util.Scanner;
public class A3qno15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.indexOf('.');
		System.out.println(str.substring(n+1));
	}
}

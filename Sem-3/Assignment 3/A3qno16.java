import java.util.Scanner;
public class A3qno16{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		if(str.contains(str1)) {
			System.out.println("First contains the second");
		}
		else {
			System.out.println("First doenst contains the second");
		}
	}
}

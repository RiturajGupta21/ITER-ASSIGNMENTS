import java.util.Scanner;
public class A3qno12 {
	public static void blocks(String str) {
		str=str.replace(" ", "");
		for(int i=0;i<str.length();i++) {
			if(i%5==0&&i!=0) {
				System.out.print(" ");
			}
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		blocks(str);
	}
}

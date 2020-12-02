import java.util.Scanner;
public class A3qno17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ch=sc.next();
		str=str.replaceAll(ch,"");
		System.out.println(str);
	}
}

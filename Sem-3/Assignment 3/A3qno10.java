import java.util.Scanner;
public class A3qno10 {
	public static void replace(String Str,String Str2,String Str3) {
		Str=Str.replaceAll(Str2,Str3);
		System.out.println(Str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.next();
		String str2=sc.next();
		replace(str,str1,str2);
	}
}

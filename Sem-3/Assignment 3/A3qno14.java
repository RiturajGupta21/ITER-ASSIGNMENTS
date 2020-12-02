import java.util.Scanner;
public class A3qno14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 for (int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				 System.out.println(ch);
				 break;
			 }
		}
	}
}

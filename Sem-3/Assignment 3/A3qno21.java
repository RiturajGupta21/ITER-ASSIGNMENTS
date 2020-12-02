import java.util.Scanner;
import java.util.StringTokenizer;
public class A3qno21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String str1=st.nextToken();
			char ch=str1.charAt(0);
			System.out.print(Character.toUpperCase(ch)+str1.substring(1)+" ");
		}
	}
}
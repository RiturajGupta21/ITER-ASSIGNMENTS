import java.util.*;
public class A3qno20 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		String str1="";
		while(st.hasMoreTokens()) {
			String str2=st.nextToken();
			StringBuilder sb=new StringBuilder(str2);
			str1+=sb.reverse()+" ";
		}
		System.out.println(str1);
	}
}

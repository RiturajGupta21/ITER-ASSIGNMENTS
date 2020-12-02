import java.util.Scanner;
import java.util.StringTokenizer;
public class A3qno9 {
	public static void delimite(String str,String del) {
		StringTokenizer st=new StringTokenizer(str,del);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.next();
		delimite(str,str1);
	}
}

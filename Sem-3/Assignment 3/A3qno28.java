import java.util.*;
public class A3qno28 {
	public static int existance(String str,String str1) {
		if(str.contains(str1)) {//contains method is already O(n) so no need to optimize more as per question
			return str.indexOf(str1);
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		System.out.println(existance(str,str1));
	}

}

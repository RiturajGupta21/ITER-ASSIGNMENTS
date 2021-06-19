import java.util.*;
public class A3qno5 {
	public static boolean isPalindrome(String s) {
		String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		return ss.equals(new StringBuilder(ss).reverse().toString());
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("Able was I, ere I saw Elba!"));
	}

}

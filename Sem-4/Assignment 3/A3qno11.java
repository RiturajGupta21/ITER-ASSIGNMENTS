import java.util.*;
public class A3qno11 {
	public static String decoding(String s) {
		int c=0;
		StringBuilder res=new StringBuilder();
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (Character.isDigit(ch))
				c=c*10+ch-'0' ;
			else {
				while(c>0){
					res.append(ch);
					c--;
				}
			}
		}
		return res.toString();
	}
	public static String encoding(String s) {
		int c=1;
		StringBuilder res=new StringBuilder();
		for (int i=1;i<=s.length();++i) {
			if (i==s.length()||s.charAt(i)!=s.charAt(i-1)){
				res.append(c);
				res.append(s.charAt(i-1));
				c=1;
			}
			else 
				c++ ;
		}
		return res.toString();
	}
	public static void main(String[] args) {
		System.out.println(decoding("3e4f2e"));
		System.out.println(encoding("aaaabcccaa"));
	}
}

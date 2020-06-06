import java.util.*;
public class A3qno16 {
	public static String pallindrome(String str){
		if(str==null||str.length()<=0)
		return str;
		else
		return (pallindrome(str.substring(1))+str.charAt(0));
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	    	System.out.println("The the sentence");
	        String str =sc.nextLine();
	        String reverse=pallindrome(str);
		if(str.equals(reverse))
		System.out.println(reverse+" is Pallindrome");
		else
		System.out.println(reverse+" not Pallindrome");
}
}
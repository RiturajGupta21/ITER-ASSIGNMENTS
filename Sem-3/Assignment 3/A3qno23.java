import java.util.*;
public class A3qno23 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String str1 = "";
	String str2 = "";
	for (int i = 0; i <str.length(); i++) {
	char ch = str.charAt(i);
	if (ch >='A'&&ch<='Z') {
		str2+=ch;
	}
	else {
		str1+=ch;
		}
	}
	System.out.println(str1+str2);
	}
}

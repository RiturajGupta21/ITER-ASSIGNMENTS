import java.util.*;
import java.util.regex.*;
public class A4qno6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pattern p=Pattern.compile("\\w+");
		Matcher m=p.matcher(str);
		while(m.find()) {
			Pattern p1=Pattern.compile("^[\\w]");
			Matcher m1=p1.matcher(m.group(0));
			while(m1.find()) {
				System.out.print(m1.group(0));
			}
		}
//		Pattern p=Pattern.compile("\\b[a-zA-Z]");
//		Matcher m=p.matcher(str);
//		while(m.find()) {
//			System.out.print(m.group(0));
//		}
	}
}
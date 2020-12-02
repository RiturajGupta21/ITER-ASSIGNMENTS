import java.util.*;
import java.util.regex.*;
public class A4qno1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pattern p=Pattern.compile("\\w+");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.print(m.group(0));
		}
//		Pattern p=Pattern.compile("\\s");
//		Matcher m=p.matcher(str);
//		System.out.println(m.replaceAll(""));
	}
}
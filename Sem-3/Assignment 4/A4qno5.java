import java.util.*;
import java.util.regex.*;
public class A4qno5 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+",Pattern.CASE_INSENSITIVE);
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 Matcher m = p.matcher(str);
		 if(m.find()) {
			 String[] arr=str.split("[0-9]");
		 for(String str1:arr) {
			 System.out.println(str1);
		 }
		 }
	}
}

import java.util.*;
import java.util.regex.*;
public class A4qno2 {
	public static void main(String[] args) {
		 Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 Matcher m = p.matcher(str);
		 if(m.matches()) {
			 System.out.println("Valid");
		 }
		 else {
			 System.out.println("InValid");
		 }
	}

}

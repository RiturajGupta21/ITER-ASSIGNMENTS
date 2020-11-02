import java.util.*;
import java.util.regex.*;
public class A4qno3 {
	public static void main(String[] args) {
		 Pattern p = Pattern.compile("([a-zAZ_-]+@)?[a-zA-Z]+(.[a-z]+)+");
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
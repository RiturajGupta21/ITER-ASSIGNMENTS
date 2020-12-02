import java.util.*;
import java.util.regex.*;
public class A4qno4 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 Matcher m = p.matcher(str);
		 int max=0;
		 while(m.find()) { 
	            int n=Integer.parseInt(m.group()); 
	            if(n>max) 
	                max=n; 
	        } 
		 System.out.println(max);
	}

}

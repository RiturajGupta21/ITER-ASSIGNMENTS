import java.util.regex.*;
public class A5qno4 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\d+");
		String str="abc 123 xxxx 1 pqr 23";
		int sum=0;
		Matcher m=p.matcher(str);
		while (m.find()) {
			int i=Integer.parseInt(m.group());
			sum=sum+i;
		}
		System.out.println(sum);
	}

}

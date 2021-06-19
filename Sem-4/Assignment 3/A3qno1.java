import java.util.*;
public class A3qno1 {
	public static int stringToInt(String s) {
		int length = s.length();
		int sign = 1;
		int f_index = 0;
		int res = 0;
		if (f_index==length)
			return 0;
		if (s.charAt(f_index)=='-'||s.charAt(f_index)=='+') {
			if (s.charAt(f_index)=='-')
				sign=-1;
			f_index++;
		}
		for (int i=f_index;i<length;i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int num=c-'0';
				res=(res*10)+num;
			}
			else 
				break;
		    }
		    return res*sign;
		  }
	public static String intToString(int n) {
		boolean checkneg=n<0;
		StringBuilder sb = new StringBuilder();
		n=checkneg?-n:n;
		List<Integer>list=new ArrayList<Integer>();
		int digitleft=n;
		int currentdigit=0;
		while (true) {
			currentdigit=digitleft%10;
			list.add(currentdigit);
			digitleft/=10;
			if (digitleft==0)
				break;
		}
		currentdigit=list.remove(0);
		sb.append(currentdigit);
		for (int c:list)
			sb.append(c);
		sb.reverse().insert(0,checkneg?'-':' ');
		return sb.toString().trim();
	}
	public static void main(String[] args) {
		System.out.println(((Object)stringToInt("-2234")).getClass().getSimpleName());
        System.out.println(((Object)intToString(-2234)).getClass().getSimpleName());
    	System.out.println(stringToInt("-2234"));
    	System.out.println(intToString(-2234));
	}

}

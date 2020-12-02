import java.util.*;
import java.text.*;
public class A5qno7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		double d=sc.nextDouble();
		 String str = nf.format(d);
		 System.out.println(str);
	}

}

//To get the number of days of the month
import java.util.*;
import java.time.*;
public class A6qno5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		YearMonth ym = YearMonth.of(2020,mon);
		int d= ym.lengthOfMonth();
		System.out.println(d);
	}

}

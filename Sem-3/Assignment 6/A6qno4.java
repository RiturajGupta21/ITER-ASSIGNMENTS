//To get the name of first and last day of the month
import java.util.*;
import java.time.*;
public class A6qno4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		YearMonth ym = YearMonth.of(2020, mon);
		 String fDay = ym.atDay(1).getDayOfWeek().name();
		 String lDay = ym.atEndOfMonth().getDayOfWeek().name();
		 System.out.println(fDay);
	 	 System.out.println(lDay);
	}
}

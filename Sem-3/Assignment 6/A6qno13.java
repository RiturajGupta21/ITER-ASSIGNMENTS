import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class A6qno13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int mon=sc.nextInt();
		int day=sc.nextInt();
		LocalDate bod=LocalDate.of(year, mon, day);
		LocalDate now=LocalDate.now();
		Period age=Period.between(bod, now);
		System.out.printf("Age is %d years, %d months and %d days old",age.getYears(),age.getMonths(),age.getDays());
	}

}

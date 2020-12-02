import java.time.LocalDate;

public class A6qno10 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Today date "+date);
		LocalDate tB=date.minusDays(10);
		System.out.println("Ten day before "+tB);
		LocalDate tA=date.plusDays(10);
		System.out.println("Ten day after "+tA);	
	}
}

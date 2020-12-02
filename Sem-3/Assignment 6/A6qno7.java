//To get date after 2 weeks
import java.time.*;
public class A6qno7 {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate tA=date.plusDays(14);
		System.out.println("After 2 weeks "+tA);
	}

}

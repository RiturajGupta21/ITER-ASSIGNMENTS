//To get the current time of New York
import java.time.*;
public class A6qno1 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Time ="+time);
	}

}

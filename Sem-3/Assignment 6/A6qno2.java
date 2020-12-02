//To get current full date and time
import java.time.*;
import java.time.format.*;
public class A6qno2 {
	public static void main(String[] args) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
	}

}

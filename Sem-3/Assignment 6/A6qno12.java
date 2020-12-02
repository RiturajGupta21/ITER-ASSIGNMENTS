import java.util.*;
import java.time.*;
public class A6qno12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b_time=sc.next();
		String a_time=sc.next();
		LocalTime ldt=LocalTime.parse(b_time);
		LocalTime ldt1=LocalTime.parse(a_time);
		long dh = Duration.between(ldt, ldt1).toHours();
		long dm = Duration.between(ldt, ldt1).toMinutes();
		long dmill = Duration.between(ldt, ldt1).toMillis();
		long ds = Duration.between(ldt, ldt1).toSeconds();
		long dn = Duration.between(ldt, ldt1).toNanos();
		System.out.println(dh+" "+dm+" "+dmill+" "+ds+" "+dn);
	}
}

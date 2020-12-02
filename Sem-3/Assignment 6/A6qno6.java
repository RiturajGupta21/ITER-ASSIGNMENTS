//To get a day of the week of specific date
import java.util.*;
import java.text.*;
public class A6qno6 {
	public static void main(String[] args) throws ParseException {
			Scanner sc=new Scanner(System.in);
			String date=sc.next();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date dt1=sdf.parse(date);
			DateFormat sdf1=new SimpleDateFormat("EEEE"); 
			String day=sdf1.format(dt1);
			System.out.println(day);
	}
}

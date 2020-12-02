import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;
public class A4qno2 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("PhoneNumber.txt");
		BufferedReader br=new BufferedReader(fr);
		 Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		 Scanner sc=new Scanner(System.in);
		 String str=br.readLine();
		 Matcher m = p.matcher(str);
		 while(m.matches()) {
			 System.out.println("Valid"+m.group());
			 if(br.readLine()==null)
				 break;
		 }
//		 else {
//			 System.out.println("InValid");
//		 }
	}

}

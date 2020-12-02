import java.io.*;
import java.util.regex.*;
public class A5qno3 {
	public static void main(String[] args) throws IOException {
		Pattern p=Pattern.compile("\\d+");
		BufferedReader br=new BufferedReader(new FileReader("Test.txt"));
		String str;
		double sum=0.0;
		while((str=br.readLine())!=null) {
			Matcher m=p.matcher(str);
			int c=0,i=0;double d=0;
			while(m.find()) {
				if(++c==2) {
					d=Double.parseDouble(m.group());
				}
				if(++i==3) {
					double d1=Double.parseDouble(m.group());
					double d2=d*d1;
					sum+=d2;
				}
			}
		}
		System.out.println(sum);
	}
}

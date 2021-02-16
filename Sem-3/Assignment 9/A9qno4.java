import java.io.*;
import java.util.*;
import java.text.*;
public class A9qno4 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("input.txt");
		FileWriter fw=new FileWriter("output.txt");
		Scanner sc=new Scanner(fr);
		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		String str="";
		while(sc.hasNext()) {
			str+=sc.next()+" ";
		}
		StringTokenizer st=new StringTokenizer(str);
		String arr[]=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i]=st.nextToken();
			i++;
		}
		fw.write(String.format("Principal     InterestRate     Time     Intrest\n"));
		int j=3;
		while(j<arr.length) {
			double p=Double.parseDouble(arr[j]);
			double ir=Double.parseDouble(arr[j+1]);
			double t=Double.parseDouble(arr[j+2]);
			double is=(p*ir*(t/12))/100;
			j=j+3;
			fw.write(String.format("%-20.2f%-13.2f%-13.2f%.2f\n", p, ir,t,is));
		}
		fw.close();
		System.out.println("Output File Texted");
	}

}

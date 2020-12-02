import java.io.FileWriter;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double am =sc.nextDouble();
		double air=sc.nextDouble();
		int nop=sc.nextInt();
		double mr=air/1200;
		double mp = am*mr/(1-(Math.pow(1+mr,-nop)));
		try {
			FileWriter fw=new FileWriter("Text.txt");
			fw.write(String.format("Payment %-15.2f Principal %.2f\n",am,mp));
			fw.write(String.format("Annual Intrest %-8.2f Term %d\n",air,nop));
		double bal = am,p,ist;
		fw.write(String.format("PaymentNumber     Interest     Principal     Balance\n"));
		for (int i=1;i<=nop;i++) {
			ist=mr*bal;
			p=mp-ist;
			bal=bal-p;
			fw.write(String.format("%-20d%-13.2f%-13.2f%.2f\n", i, ist,p,bal));
		}
		fw.write(String.format("Final Payment%11.2f\n",mp));
		fw.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("Written Successfully");
	}
}
import java.text.NumberFormat;

public class Q4 {
	public static void main(String[] args) {
		float sum=0;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		for(int  i=0;i<args.length;i++) {
			sum+=Float.parseFloat(args[i]);
		}
		if(args.length<2) {
			System.err.println("only one argument");
		}
		System.out.println(nf.format(sum));
	}

}

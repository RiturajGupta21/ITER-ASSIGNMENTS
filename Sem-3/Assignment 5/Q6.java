import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q6 {
	public static void main(String[] args) {
        for (double c=0;c<=100;c++){
        	NumberFormat nf=new DecimalFormat("0.00");
    		double d=(c*9.0/5.0)+32 ;
            System.out.println(c+" = "+nf.format(d)+"\t");
            }
	}


	}

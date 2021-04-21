public class A1qno14 {
    public static double power(double x,int y) {
		double res=1;
		if(y<0){
		      y=-y;
		      x=1.0/x;
		    }
		while(y!=0) {
			if((y&1)!=0) {
				res*=x;
			}
			x*=x;
			y>>=1;
		}
		return res;
	}
    public static void main(String[] args) {
        System.out.printf("Required Ans %.2f",power(2,-1));
    }
}

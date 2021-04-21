public class A1qno12 {
    public static int add(int res,int y) {
		while(y!=0) {
			int carry=res&y;
			res^=y;
			y=carry<<1;
		}
		return res;
	}
	public static int multiply(int x,int y) {
		int res=0,k=0;
		while(x!=0) {
			if((x&1)!=0) {
				res=add(res,y<<k);
			}
			k+=1;
			x>>=1;
		}
		return res;
	}
    public static void main(String[] args) {
        System.out.println(multiply( 0b1011,0b1001));
    }
}

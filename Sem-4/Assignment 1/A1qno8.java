public class A1qno8 {
    public static void main(String[] args) {
        int x=0b1001001,i=6,j=1;
		if (((x>>i)&1)!=((x>>j)&1)){
			int bm =(1<<i)|(1<<j);
			x^=bm;
		}
		System.out.println(Integer.toBinaryString(x));
    }
}

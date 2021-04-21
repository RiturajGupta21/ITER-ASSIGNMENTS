public class A1qno11 {
    public static void main(String[] args) {
        int x=0b0111;
		int n=((int)(Math.log(x)/Math.log(2)+1));
		for(int i=0;i<n;i++) {
			if ((((x>>i)&1)!=((x>>(i+1))&1))) {
				x^=(1<<i)|(1L<<(i + 1));
			}
		}
		System.out.println(x);
    }
}

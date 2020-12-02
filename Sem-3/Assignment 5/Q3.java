public class Q3 {
	public static void main(String[] args) {
		int sum=0;
		for(int  i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		if(args.length<2) {
			System.err.println("only one argument");
		}
		System.out.println(sum);
	}

}

public class A1qno3 {
    public static void main(String[] args) {
        long x = 0b1011;
		short result = 0;
		while (x != 0) {
		    result^= 1;
		    x &= (x - 1);
		}
		System.out.println("Final answer = "+result);
    }
}

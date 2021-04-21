import java.util.Scanner;

public class A1qno6 {
    public static int computepartity(int x){
        int result = 0;
		while (x != 0) {
		    result^= 1;
		    x &= (x - 1);
		}
		return result;
    }
    public static void lookupTable(){
        int parity[] =new int[(int)Math.pow(2, 16)];
        for(int i=0;i<parity.length;i++){
            parity[i]=computepartity(i);
        }
    }
    public static long parity(long x){
        int ws = 16;
		int bm = 0xFFFF;
		return(computepartity((int)(x>>(3*ws))&bm)^computepartity((int)(x>>(2*ws))&bm)^computepartity((int)(x>>(ws))&bm)^computepartity((int)x&bm));
    }
    public static void main(String[] args) {
        lookupTable();
        Scanner sc=new Scanner(System.in);
        long x=Long.parseLong(sc.nextLine(),2);
        System.out.println(parity(x));
        sc.close();
    }
}

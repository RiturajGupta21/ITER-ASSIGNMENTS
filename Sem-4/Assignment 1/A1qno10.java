import java.util.Scanner;

public class A1qno10 {
    static long A[];
    public static int computeReverse(int n){
        int c=16;
        String b="";
        while(n!=0||c!=0){
            b+=(n%2);
            n/=2;
            c--;
        }
        return (Integer.parseInt(b,2));
    }
    public static void lookupTable(){
        A=new long[(int)Math.pow(2, 16)];
        for(int y=0;y<A.length;y++){
            A[y]=computeReverse(y);
        }
    }
    public static long reversebit(long x){
        int ws=16,bm=0xFFFF;
        return A[(int)(x&bm)]<<(3*ws)|A[(int)((x>>ws)&bm)]<<(2*ws)|A[(int)((x>>(2*ws))&bm)]<<ws|A[(int)((x>>(3*ws))&bm)];
    }
    public static void main(String[] args) {
        lookupTable();
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        System.out.println(reversebit(x));
        sc.close();
    }
}

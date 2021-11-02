public class FibonacciDyanmic {
    public static long arr[]=new long[12];
    public static long[] fib_dp(int n){
        int i;
        arr[0]=0;
        arr[1]=1;
        for(i=2;i<=n;i++){
            System.out.println("time bw for n value = "+i+" = "+System.nanoTime());
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        System.out.println("Start time "+starttime);
        fib_dp(8);
        long endtime=System.nanoTime();
        System.out.println("End time "+endtime);
        System.out.println("Elapsed time "+(endtime-starttime));
    }
}

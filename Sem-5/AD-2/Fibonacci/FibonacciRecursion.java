public class FibonacciRecursion{
    public static long fib_r(int n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        System.out.println("time bw for n value = "+n+" = "+System.nanoTime());
        return(fib_r(n-1)+fib_r(n-2));
    }
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        System.out.println("Start time "+starttime);
        fib_r(10);
        long endtime=System.nanoTime();
        System.out.println("End time "+endtime);
        System.out.println("Elapsed time "+(endtime-starttime));
    }
}
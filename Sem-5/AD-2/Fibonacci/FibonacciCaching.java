public class FibonacciCaching {
    public static long arr[]=new long[11];
    public static long fib_c(int n){
        long res=0;
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else if(arr[n]!=0){
            return arr[n];
        }
        else{
            System.out.println("time bw for n value = "+n+" = "+System.nanoTime());
            res=fib_c(n-1)+fib_c(n-2);
            arr[n]=res;
        return res;
        }
    }
    public static void main(String[] args) {
        arr[0]=0;
        arr[1]=1;
        long starttime=System.nanoTime();
        System.out.println("Start time "+starttime);
        fib_c(10);
        long endtime=System.nanoTime();
        System.out.println("End time "+endtime);
        System.out.println("Elapsed time "+(endtime-starttime));
    }
}

public class FibonacciUltimate {
    public static long fib_ultimate(int n){
        int i;
        long back2=0,back1=1,next;
        if(n==0 ){
            return 0;
        }
        for(i=2;i<=n;i++){
            System.out.println("time bw for n value = "+i+" = "+System.nanoTime());
            next=back1+back2;
            back2=back1;
            back1=next;
        }
        return back1+back2;
    }
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        System.out.println("Start time "+starttime);
        fib_ultimate(10);
        long endtime=System.nanoTime();
        System.out.println("End time "+endtime);
        System.out.println("Elapsed time "+(endtime-starttime));
    }
}

public class Recursive{
    public static int knapsack(int wt[],int val[],int w,int n){
        if(n==0 || w==0)
            return 0;
        if (wt[n - 1] > w)
            return knapsack(wt, val,w, n - 1);
        else
            return Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1), knapsack(wt, val, w, n-1));
    }
    public static void main(String[] args) {
        int wt[]={5,4,6,3};
        int val[]={10,40,30,50};
        int w=10;
        int n=val.length;
        System.out.println(knapsack(wt, val, w, n));
    }
}
public class Dyanamic{
    public static void knapsack(int wt[], int val[], int w, int n) {
        int k[][] = new int[n + 1][w + 1];
        for (int i=0; i<=n; i++)
            for (int j=0; j<=w; j++) {
                k[i][j] = 0;
            }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                k[i][j] = k[i - 1][j];
                
                if ((j >= wt[i-1]) && (k[i][j] < k[i - 1][j - wt[i - 1]] + val[i - 1])) {
                    k[i][j] = k[i - 1][j - wt[i - 1]] + val[i - 1]; 
                }
                
                System.out.print(k[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Max Value: " + k[n][w]);
        System.out.println("Selected items: ");
        while (n != 0) {
            if (k[n][w] != k[n - 1][w]) {
                System.out.println("Items " + n + " with W = " + wt[n - 1] + " and Value = " + val[n - 1]);
                w = w - wt[n-1];
            }
            n--;
        }
    }
    public static void main(String[] args) {
        int wt[]={4,5,3,7};
        int val[]={2,5,1,4};
        int w=5;
        int n=val.length;
        knapsack(wt, val, w, n);
    }
}
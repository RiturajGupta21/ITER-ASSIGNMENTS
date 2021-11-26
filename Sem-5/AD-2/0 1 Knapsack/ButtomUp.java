public class ButtomUp {
    public static int knapsack(int wt[], int val[], int w, int n) {
        int K[][] = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0)
                    K[i][j] = 0;
                else if (wt[i - 1] <= j)
                    K[i][j] = Math.max(val[i - 1] + K[i - 1][j - wt[i - 1]], K[i - 1][j]);
                else
                    K[i][j] = K[i - 1][j];
            }
        }

        return K[n][w];
    }

    public static void main(String[] args) {
        int wt[] = { 5, 4, 6, 3 };
        int val[] = { 10, 40, 30, 50 };
        int w = 10;
        int n = val.length;
        System.out.println(knapsack(wt, val, w, n));
    }
}

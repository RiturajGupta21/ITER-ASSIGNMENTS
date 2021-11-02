public class FloydWarshall{
    public static void floyd(int edges[][],int v){
        int i,j,k;
        for(k=0;k<v;k++){
            for(i=0;i<v;i++){
                for(j=0;j<v;j++){
                    if(edges[i][k]!=Integer.MAX_VALUE && edges[k][j]!=Integer.MAX_VALUE){
                        edges[i][j]=Math.min(edges[i][j],(edges[i][k]+edges[k][j]));
                    }
                }
            }
        }
        for(i=0;i<v;i++) {
            for(j=0;j<v;j++) {
              if (edges[i][j] == Integer.MAX_VALUE)
                System.out.print("INF ");
              else
                System.out.print(edges[i][j] + "  ");
            }
            System.out.println();
          }
    }
    public static void main(String args[]){
        int v=4;
        int x=Integer.MAX_VALUE;
        int edges[][]={ { 0, 3, x, 5 }, { 2, 0, x, 4 }, { x, 1, 0, x }, { x, x, 2, 0 } };
        floyd(edges,v);
    }
}
import java.util.Scanner;

class IntegerPartion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elemnets to be in set -> ");
        int n=sc.nextInt();
        int s[]=new int[n+1];
        for(int i=1;i<=n;i++){
            System.out.print("Enter "+i+" elemnet of set -> ");
            s[i]=sc.nextInt();
        }
        System.out.print("Enter the number of partion -> ");
        int k=sc.nextInt();
        partion(s, n, k);
    }
    public static void partion(int s[],int n,int k){
        int[][] m=new int [n+1][k+1];
        int[][] d=new int [n+1][k+1];
        int[] p=new int[n+1];
        int cost,i,j,x;
        p[0]=0;
        for(i=1;i<=n;i++)
            p[i]=p[i-1]+s[i];
        for(i=1;i<=n;i++)
            m[i][1]=p[i];
        for(j=1;j<=k;j++)
            m[1][j]=s[1];
        for(i=2;i<=n;i++){
            for(j=2;j<=k;j++){
                m[i][j]=Integer.MAX_VALUE;
                for(x=1;x<=(i-1);x++){
                    cost=Math.max(m[x][j-1], (p[i]-p[x]));
                    if(m[i][j]>cost){
                        m[i][j]=cost;
                        d[i][j]=x;
                    }
                }
            }
        }
        System.out.println("\n-----M and D matric-----");
        for(i=2;i<=n;i++){
            for(j=2;j<=k;j++){ 
                System.out.println("m["+i+"]["+j+"] = "+m[i][j]+"\td["+i+"]["+j+"] = "+d[i][j]);
            }
        }
        System.out.println("\n-----Partion Order-----");
        resconstruct_partition(s,d,n,k);
    }

    private static void resconstruct_partition(int[] s, int[][] d, int n, int k) {
        if(k==1)
            print_books(s,1,n);
        else{
            resconstruct_partition(s, d, d[n][k], k-1);
            print_books(s, d[n][k]+1, n);
        }
    }

    private static void print_books(int[] s, int start, int end) {
        int i;
        for(i=start;i<=end;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
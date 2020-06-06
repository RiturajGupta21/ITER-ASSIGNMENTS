import java.util.Scanner;
public class A8qno5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and column of 2-D matrix respectively:");
        int M=sc.nextInt();
        int N=sc.nextInt();
        double m[][]=new double[M+1][N+1];
        int i,j;
        double s=0;
        for(i=0;i<M;i++)
        {
            System.out.println("Enter all the marks of "+(i+1)+" Student in array");
            for(j=0;j<N;j++)
            {
                m[i][j]=sc.nextDouble();
            }
        }
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                s=s+m[i][j];
            }
            s=s/j;
            m[i][j]=s;
            s=0;
        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<M;j++)
            {
                s=s+m[j][i];
            }
            s=s/j;
            m[j][i]=s;
            s=0;
        }
        System.out.println("Final matrix:");
        for(i=0;i<(M+1);i++)
        {
            for(j=0;j<(N+1);j++)
            {
               if((i==M)&&(j==N))
               System.out.print(" ");
               else
               System.out.print(+m[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
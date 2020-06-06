import java.util.Scanner;
public class A8qno9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter row and column of matrix1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter row and column of matrix2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        double a[][]=new double[r1][c1];
        double b[][]=new double[r2][c2];
        System.out.println("Enter the array elenents of matrix 1");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Enter the array elenents of matrix 2");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Display matrix 1");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(+a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Display matrix 2");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(+b[i][j]+" ");
            }
            System.out.println();
        }
        if(c1==r2)
        {
            double c[][]=multiplyMatrix(a,b,r1,c1,c2);
            System.out.println("New matrix:");
            for(i=0;i<c.length;i++)
            {
                for(j=0;j<c[i].length;j++)
                {
                    System.out.print(+c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("multiplication not possible");
        }
    }
    public static double[][] multiplyMatrix(double a[][],double b[][],int p,int q,int r)
    {
        int i,j,k;
        double s=0.0;
        double c[][]=new double[p][r];
        for(i=0;i<p;i++)
        {
            for(j=0;j<r;j++)
            {
                for(k=0;k<q;k++)
                {
                    s=s+(a[i][k]*b[k][j]);
                }
                c[i][j]=s;
                s=0;
            }
        }
        return(c);
    }
}
                
                
        
import java.util.Scanner;
public class A8qno6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        double a[][]=new double[3][3];
        double b[][]=new double[3][3];
        System.out.println("Enter the array elenents of matrix 1 in 3*3 order");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Enter the array elenents of matrix 2 in 3*3 order");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sc.nextDouble();
            }
        }
        double c[][]=addMatrix(a,b);
        System.out.println("Array C:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(+c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double a[][],double b[][])
    {
        int i,j,t=0;
        double c[][]=new double[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return(c);
        
    }
}
 
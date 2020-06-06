import java.util.Scanner;
public class A8qno3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        double m[][]=new double[4][4];
        int i,j;
        System.out.println("Enter the array elements of 4-by-4 matrix row by row:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Display Array matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(+m[i][j]+" ");
            }
            System.out.println();
        }
        double sum=sumMajorDiagonal(m);
        System.out.println("Sum of the elements in the major diagonal is:"+sum);
    }
    public static double sumMajorDiagonal(double m[][])
    {
        double sum=0.0;
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(i==j)
                {
                    sum=sum+m[i][j];
                }
            }
        }
        return(sum);
    }
}
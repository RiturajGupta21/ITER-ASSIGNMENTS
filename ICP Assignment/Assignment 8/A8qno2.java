import java.util.Scanner;
public class A8qno2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        double m[][]=new double[3][4];
        System.out.println("Enter the array elements of matrix 3*4");
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Array matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(+m[i][j]+" ");
            }
            System.out.println();
        }
        for(j=0;j<4;j++)
        {
        double sum=sumColumn(m,j);
        System.out.println("Sum of the elements at column "+j+" is "+sum);
        }
    }
    public static double sumColumn(double m[][],int columnIndex)
    {
        double sum=0.0;
        int i;
        for(i=0;i<3;i++)
        {
            sum=sum+m[i][columnIndex];
        }
        return(sum);
    }
}
        
        
        
                
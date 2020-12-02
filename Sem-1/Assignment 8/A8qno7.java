import java.util.Scanner;
public class A8qno7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of square 2-D array");
        int n=sc.nextInt();
        int i,j,t=0;
        int m[][]=new int[n][n];
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(+m[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i<j)
                {
                    t=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=t;
                }
            }
        }
        System.out.println("Transpose Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(+m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
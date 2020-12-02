import java.util.Scanner;
public class A8qno4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter a for a[][] is square matrix");
        System.out.println("Enter b for a[][] is rectangular matrix");
        System.out.println("Enter c for a[][] may be ranged");
        System.out.println("Enter a user choice");
        char ch=sc.next().charAt(0);
        if(ch=='a')
        {
            System.out.println("Enter the value of n");
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            System.out.println("Enter the array elements value of "+n+"*"+n+" matrix in array");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            squarematrix(a,n);
        }
        else if(ch=='b')
        {
            System.out.println("Enter the value of  m and n respectively");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int[m][n];
            System.out.println("Enter integer in the array "+m+"*"+n+" order:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            rectangularmatrix(a,m,n);
        }
        else if(ch=='c')
        {
            System.out.println("Enter the no. of rows of the matrix");
            int m=sc.nextInt();
            int a[][]=new int[m][];
            for(i=0;i<m;i++)
            {
                System.out.println("Enter no. of column of"+i+" row");
                int n=sc.nextInt();
                a[i]=new int[n];
                System.out.println("Enter the array elements "+i+" row");
                for(j=0;j<a[i].length;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            raggedmatrix(a,m);
        }
        else
        {
            System.out.println("invalid choice");
        }
    }
    public static void squarematrix(int a[][],int n)
    {
        int b[][]=new int [n][n];
        int i,j;
        for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j]=a[i][j];
                }
            }
        System.out.println("Display array b");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(+b[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void rectangularmatrix(int a[][],int m,int n)
    {
           int b[][]=new int[m][n];
           int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j]=a[i][j];
                }
            }
            System.out.println("Display array b");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(+b[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void raggedmatrix(int a[][],int m)
    {
        int i,j;
        int b[][]=new int [m][];
            for(i=0;i<m;i++)
            {
                b[i]=new int[a[i].length];
                for(j=0;j<a[i].length;j++)
                {
                    b[i][j]=a[i][j];
                }
            }
            System.out.println("Display Array b:");    
            for(i=0;i<b.length;i++)
            {
                for(j=0;j<b[i].length;j++)
                {
                    System.out.print(+b[i][j]+" ");
                }
                System.out.println();
            }
            
        }
    }   
    
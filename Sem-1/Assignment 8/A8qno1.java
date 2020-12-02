import java.util.Scanner;
public class A8qno1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int M,N,i,j;
        System.out.println("Enter the order of matrix M and N respectively");
        M=sc.nextInt();
        N=sc.nextInt();
        int m[][]=new int [M][N];
        System.out.println(+M+"-by-"+N+" array in the tabular format:");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
                System.out.print(+m[i][j]+" ");
            System.out.println();
        }
    }
}
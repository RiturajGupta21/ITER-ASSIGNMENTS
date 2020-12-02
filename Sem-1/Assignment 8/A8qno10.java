import java.util.Scanner;
public class A8qno10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,max,t,k=0;
        int m[][]=new int[4][4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]=0+(int)(Math.random()*(2));
            }
        }
        System.out.println("Display Matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(+m[i][j]+" ");
            }
            System.out.println();
        }
        max=0;
        t=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(m[i][j]==1)
                {
                    k=k+1;
                }
            }
            if(t<k)
            {
                t=k;
                max=i;
            }
            k=0;
        }
        System.out.println("Rows="+max);
        max=0;
        t=0;
        k=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(m[j][j]==1)
                {
                    k=k+1;
                }
            }
            if(t<k)
            {
                t=k;
                max=i;
            }
        }
        System.out.println("Column="+max);
    }
}
public class A8qno8
{
    public static void main(String args[])
    {
        int i,j,k,t=0;
        int N=Integer.parseInt(args[0]);
        boolean m[][]=new boolean[N][N];
        System.out.println("original matrix");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        for(i=2;i<N;i++)
        {
            for(j=2;j<N;j++)
            {
                if(i!=j)
                {
                int min=Math.min(i,j);
                for(k=2;k<=min;k++)
                {
                    if((i%k==0)&&(j%k==0))
                    {
                        t=t+1;
                        break;
                    }
                }
                if(t!=0)
                m[i][j]=false;
                else
                m[i][j]=true;
                t=0;
                }
            }
        }
        System.out.println("New Matrix");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                

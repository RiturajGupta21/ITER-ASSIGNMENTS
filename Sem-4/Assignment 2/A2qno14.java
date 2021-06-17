import java.util.*;
public class A2qno14 {
	public static void rotate(int[][] matrix,int len) {
		int[][] newmatrix=new int[len][len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				int x=matrix[i][j];
				newmatrix[j][len-1-i]=x;
			}
		}
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
		            matrix[i][j]=newmatrix[i][j];
		        }
		    }
		}
	public static void print(int[][] matrix,int n) {
		System.out.println("\n2-D Array:");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of N");
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		int c=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=c;
				c=c+1;
			}
		}
		print(matrix,n);
		int len=matrix.length;
		rotate(matrix,len);
		print(matrix,n);
	}

}

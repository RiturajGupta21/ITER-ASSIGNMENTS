import java.util.*;
public class A3qno10 {
	public static void sinwave(char[][] arr,String s){
		int row=1;
		boolean flag=true;	     
		for(int i=0;i<arr.length;i++){
			arr[row][i]=s.charAt(i);
			if(row==3)	
				flag=false;    
			else if(row==1)
				flag=true;
			if(flag)
	        	row++;
	        else
	            row--;
		}
		for (int i=1;i<4;i++){
			for (int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String s="HelloWorld";
		int n=s.length();
		char [][]arr=new char[n][n];
		sinwave(arr,s);
	}
}

import java.util.*;
public class A3qno30 {
	public static void sort(String arr[]) {
		for (int i=1 ;i<arr.length; i++) { 
	        String str = arr[i]; 
	        int j=i-1; 
	        while (j>=0&&str.length()<arr[j].length()) { 
	            arr[j+1] = arr[j]; 
	            j--; 
	        } 
	        arr[j+1]=str; 
	    } 
		 for (int i=0; i<arr.length; i++)
		      System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		sort(arr);
	}

}

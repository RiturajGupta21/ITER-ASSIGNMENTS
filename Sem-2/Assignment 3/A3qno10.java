import java.util.*;
public class A3qno10 {
	 public static int fibo(int n) 
    { 
    if (n == 0) 
       return 0;
    if (n==1)
    	return 1;
    return fibo(n-1) + fibo(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n of which you want fibonacci");
    int n = sc.nextInt(); 
    for (int i=n;i>=0;i--) {
    	   System.out.print(fibo(n-i)+" "); 
    } 
} 
}

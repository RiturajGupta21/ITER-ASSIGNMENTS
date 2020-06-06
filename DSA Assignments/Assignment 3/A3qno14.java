import java.util.*;
public class A3qno14 {
public static int multiply(int n, int m) {
if (n > 0 && m < 0) { 
        return multiply(m, n); 
    } 
 else if (n < 0 && m < 0) { 
        return multiply((-1 * n), (-1 * m)); 
    } 
if (n > m) { 
        return multiply(m, n); 
    } 
 else if (m != 0) { 
        return n + multiply(n, m - 1); 
    }  else { 
        return 0; 
    } 
    } 
 public static void main(String[] args) { 
          Scanner sc=new Scanner (System.in);
System.out.println("Enter two number whose product has to be found");
            int m=sc.nextInt();
            int n=sc.nextInt();
        System.out.println (m+"*"+n " = " + multiply(m, n)); 
}

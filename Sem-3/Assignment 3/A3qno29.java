import java.util.*;
public class A3qno29 {
	public static char occurance(String str) {  
        int arr[] = new int[256]; 
        for (int i=0;i<str.length();i++) 
            arr[str.charAt(i)]++; 
        int n=-1; 
        char ch=' '; 
        for (int i=0;i<str.length();i++) { 
            if (n<arr[str.charAt(i)]) { 
                n=arr[str.charAt(i)]; 
                ch=str.charAt(i); 
            } 
        } 
        return ch; 
    }
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println(occurance(str));
	}
}

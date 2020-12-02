import java.util.*;
public class A3qno15 {
	 public static String reverse(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        	return reverse(str.substring(1)) + str.charAt(0);
	    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("The the sentence");
        String str =sc.nextLine();
        System.out.println("String obtained after being reversed " + reverse(str));
    }

   
}
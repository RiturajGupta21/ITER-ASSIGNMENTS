import java.io.*;
import java.util.*;
public class A9qno2 {
	public static void main(String[] args) throws IOException {
		 Console c = System.console();
		  if(c == null){   
	            System.out.print("No console available");   
	            return;   
	        }
		  System.out.println("Enter the password");   
	      char[] ch=c.readPassword(); 
	      String str = String.valueOf(ch);   
	      System.out.println("Password " + str);  
	}

}

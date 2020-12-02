import java.util.Scanner;
public class A3qno8 {
	public static void main(String[] args) {
		 String str, str1 = "";
	        Scanner sc = new Scanner(System.in);
	        str = sc.nextLine();
	        for(int i=str.length()-1;i>=0;i--){
	            str1+=str.charAt(i);
	        }
	        if(str.equalsIgnoreCase(str1)){
	            System.out.println("The string is palindrome.");
	        }
	        else{
	            System.out.println("The string is not palindrome.");
	        }
	}

}

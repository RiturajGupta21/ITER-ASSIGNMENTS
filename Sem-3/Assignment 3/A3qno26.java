import java.util.Scanner;
public class A3qno26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int v=0;
		str=str.toLowerCase();
		 for(int i = 0; i < str.length(); ++i){
	            char ch = str.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
	                v++;
	            }
		 }
		 System.out.println(v+" vowels "+(str.length()-v)+" consonants");
	}
}

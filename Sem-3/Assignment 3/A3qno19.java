import java.util.Scanner;
public class A3qno19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.matches("[0-9]+")) {
			System.out.println("String only contains digit");
		}
		else {
			System.out.println("String does not contains only digit");
		} 
	}

}
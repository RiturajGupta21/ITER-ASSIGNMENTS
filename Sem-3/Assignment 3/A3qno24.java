import java.util.*;
public class A3qno24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++) {
			char ch=(char)(97+Math.random()*26);
			str+=ch;
		}
		System.out.println(str);
	}
}

import java.util.*;
public class A5qno1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int id=s.indexOf(".");
		String s1=s.substring(0,id);
		String s2=s.substring(id+1);
		int num=Integer.parseInt(s1);
		int num1=Integer.parseInt(s2);
		int sum=num+num1;
		System.out.println(sum);
		
	}
}

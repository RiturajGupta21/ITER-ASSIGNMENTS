import java.util.*;
public class A7qno2 {
	public static void main(String[] args) {
		LinkedList <String> ll=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(sc.next());
		}
		Collections.sort(ll);
		System.out.println(ll);	
	}

}

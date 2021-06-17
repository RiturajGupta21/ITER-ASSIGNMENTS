import java.util.*; 
public class A2qno2 {
	public static List<Integer> plusOne (List<Integer> l) {
		int n=l.size()-1;
		l.set(n,l.get(n)+1);
		for (int i=n;i>0&&l.get(i)==10;i--) {
			l .set(i,0) ;
			l.set(i-1,l.get(i-1)+1);
		}
		if (l.get(0)==10) {
			l.set(0,0);
			l.add(0,1);
		}
		return l ;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(9);
		System.out.println(plusOne(l));
	}

}

import java.util.*;
public class A2qno4 {
	public static int deleteDuplicates(List<Integer>l) {
		int j=0;
		for (int i=0;i<l.size()-1;i++)
			if (l.get(i)!=(l.get(i+1)))
				l.set(j++,l.get(i));
			l.set(j++,l.get(l.size()-1));
		return j;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l,2,3,5,7,11,11,11,13);
		int n=deleteDuplicates(l);
		for(int i=0;i<n;i++) {
			System.out.print(l.get(i)+" ");
		}
	}
}

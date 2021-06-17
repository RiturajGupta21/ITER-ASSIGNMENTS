import java.util.*;
public class A2qno9 {
	public static List<Integer> nextPermutation(List<Integer> l) {
		int k=l.size()-2;
		while(k>=0&&l.get(k)>=l.get(k+1)) {
			k--;
		}
		if (k==-1) {
		return Collections.emptyList();
		}
		for (int i=l.size()-1;i>k;--i) {
			if (l.get(i)>l.get(k)) {
				Collections.swap(l, k, i);
				break ;
			}
		}
		Collections.reverse (l.subList(k+1,l.size())) ;
		return l;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l,65,66,67);
		nextPermutation(l);
		System.out.println(l);
	}

}

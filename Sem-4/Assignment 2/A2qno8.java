import java.util.*;
public class A2qno8 {
	public static void applyPermutation(List<Character> A,List<Integer> P){
		for (int i =0;i<A.size();++i){
			int next=i;
			while (P.get(next)>=0){
				Collections.swap(A,i,P.get(next));
				int temp = P.get(next);
				P.set(next,P.get(next)-P.size());
				next = temp;
			}
		}
	}
	public static void main(String[] args) {
		List<Character> l=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		Collections.addAll(l,'a','b','c','d');
		Collections.addAll(l2,2,0,1,3);
		applyPermutation(l,l2);
		System.out.println(l);
	}

}

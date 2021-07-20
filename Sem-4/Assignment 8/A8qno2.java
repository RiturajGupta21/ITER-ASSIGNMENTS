import java.util.*;
public class A8qno2 {
	public static List<Integer> mergeKSortedArray(int arr[][]){
		List<Integer> l=new LinkedList<>();
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			for(int e:arr[i])
				p.add(e);
		}
		Iterator<Integer> it=p.iterator();
		while(it.hasNext())
			l.add(p.remove());
		return l;
	}
	public static void main(String[] args) {
		int arr[][]= {{1,5,8,9},{2,3,7,10},{4,6,11,15}};
		System.out.println(A8qno2.mergeKSortedArray(arr));
	}
}

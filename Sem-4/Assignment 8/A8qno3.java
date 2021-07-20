import java.util.*;
public class A8qno3 {
	public static void sortApproximatelySortedData(Iterator<Integer> it,int k) {
			PriorityQueue <Integer> p=new PriorityQueue<>();
			for (int i=0;i<k&&it.hasNext();++i)
				p.add(it.next());
			while (it.hasNext()) {
				p.add(it.next());
				Integer smallest=p.remove();
				System.out.println(smallest);
			}
			while (!p.isEmpty()) {
				Integer smallest=p.remove();
				System.out.println(smallest);
			}
	}
	public static void main(String[] args) {
		List <Integer> l=new ArrayList<>();
		l.addAll(Arrays.asList(3,-1,2,6,4,5,8));
		A8qno3.sortApproximatelySortedData(l.iterator(), 2);
	}
}

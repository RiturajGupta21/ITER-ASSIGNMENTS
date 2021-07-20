import java.util.*;
public class A8qno1{
	public static List<String> topK(int k, Iterator<String> it) {
		PriorityQueue <String > p=new PriorityQueue<>(k,new Comparator<String >(){
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		while (it.hasNext()) {
			p.add(it.next());
			if (p.size() > k){
				p.poll();
			}
		}
		return new ArrayList<String>(p);
	}
	public static void main(String args[]) {
		String a[]={"Ram","Shyam","Govind","Hari","Shankar","Madhav"};
		PriorityQueue<String> p=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
			p.add(a[i]);
		Iterator<String> it=p.iterator();
		System.out.println(topK(1,it));
	}
}
import java.util.*;
class DistComp implements Comparator<A8qno4> {
	public int compare(A8qno4 d1, A8qno4 d2) {
		return Double.compare(d1.distance(), d2.distance());
	}
}
public class A8qno4 {
	double x,y,z;	
	public A8qno4(double a,double b,double c){
		x=a;y=b;z=c;
	}
	public double distance(){
		return Math.sqrt(x*x+y*y+z*z);
	}
	public static List<A8qno4> FindClosestStars(int k,Iterator<A8qno4> it){
		PriorityQueue<A8qno4> maxHeap=new PriorityQueue<>(Collections.reverseOrder(new DistComp()));
		while(it.hasNext()){
			maxHeap.add(it.next());
			if(maxHeap.size() == k+1)
				maxHeap.remove();
		}
		return new ArrayList<A8qno4>(maxHeap);
	}
	public static void main(String args[]) {
		List<A8qno4> list=new ArrayList<>();
		list.add(new A8qno4(1,2,3));
		list.add(new A8qno4(4,5,6));
		list.add(new A8qno4(2,3,4));
		list.add(new A8qno4(7,8,9));
		list.add(new A8qno4(5,6,7));
		list.add(new A8qno4(4,3,2));
		list.add(new A8qno4(3,4,5));
		list.add(new A8qno4(8,9,7));
		List<A8qno4> res=FindClosestStars(3,list.iterator());
		Iterator<A8qno4> it=res.iterator();
		while(it.hasNext()){
			A8qno4 tmp=it.next();
			System.out.println(tmp.x+", "+tmp.y+", "+tmp.z);
		}	
	}
}
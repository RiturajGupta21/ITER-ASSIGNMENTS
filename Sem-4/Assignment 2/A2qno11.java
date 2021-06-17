import java.util.*;
public class A2qno11 {
	public static List<Integer> randomSubset(int k, int n) {
		Map<Integer,Integer> m=new HashMap<>();
		Random r=new Random();
		for (int i=0;i<k;i++) {
			int ran=i+r.nextInt(n-i);
			Integer pl=m.get(ran);
			Integer p2=m.get(i);
			if (pl==null&&p2==null) {
				m.put(ran,i);
				m.put(i,ran);
			}
			else if (pl==null&&p2!=null) {
				m.put(ran,p2);
				m.put(i,ran);
			}
			else if (pl!=null&&p2==null) {
				m.put(i,pl);
				m.put(ran,i);
			}
			else {
				m.put(i,pl);
				m.put(ran,p2);
			}
		}
		List<Integer> res=new ArrayList<>(k);
		for (int i=0;i<k;i++) {
			res.add(m.get(i));
		}
		return res ;
	}
	public static void main(String[] args) {
		System.out.println(randomSubset(6,14));
	}

}

import java.util.*;
public class A2qno1 {
	public static void dfp(List<Integer> arr) {
		int b=0,m=0,pivot=1,e=arr.size()-1;
		while(m<=e) {
			if(arr.get(m)<pivot) {
				Collections.swap(arr,b, m);
				++b;
				++m;
			}
			else if(arr.get(m)>pivot) {
				Collections.swap(arr, m, e);
				--e;
			}
			else {
				++m;
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		Collections.addAll(al, 0,1,2,0,2,1,1);
		dfp(al);
		System.out.println("List "+al);
	}

}

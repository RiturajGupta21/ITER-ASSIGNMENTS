import java.util.*;
public class A2qno3 {
	public static List <Integer> multiply (List<Integer>l1,List<Integer>l2) {
		int sign=l1.get(0)<0^l2.get(0)<0?-1:1;
		l1.set(0,Math.abs(l1.get(0)));
		l2.set(0,Math.abs(l2 .get(0)));
		List<Integer>res=new ArrayList<Integer>(Collections.nCopies(l1.size()+l2.size(),0));
		for(int i=l1.size()-1;i>=0;--i){
			for(int j=l2.size()-1;j>=0;--j){
				res.set(i+j+1,res.get(i+j+1)+l1.get(i)*l2.get(j));
				res.set(i+j,res.get(i+j)+res.get(i+j+1)/10);
				res.set(i+j+1,res.get(i+j+1)%10);
			}
		}
		int non0=0;
		while (non0<res.size()&&res.get(non0)==0)
			non0++;
		res=res.subList(non0,res.size());
		if (res.isEmpty())
			return Arrays.asList(0);
		res.set(0,res.get(0)*sign);
		return res;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> l1=new ArrayList<Integer>();
		Collections.addAll(l,1,2,3);
		Collections.addAll(l1,4,5,6);
		System.out.println(multiply(l,l1));
	}

}

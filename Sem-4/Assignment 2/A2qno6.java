import java.util.*;
public class A2qno6 {
	public static int profit(List<Integer> p) {
		int tmaxprofit=0;
	    List<Integer> fprofits=new ArrayList<Integer>();
	    int minprice=Integer.MAX_VALUE;
	    for(int i=0;i<p.size();++i){
	      minprice=Math.min(minprice,p.get(i));
	      tmaxprofit=Math.max(tmaxprofit,(p.get(i)-minprice));
	      fprofits.add(tmaxprofit);
	    }

	    int maxprize=Integer.MIN_VALUE;
	    for(int i=p.size()-1;i>0;--i)
	    {
	      maxprize=Math.max(maxprize,p.get(i));
	      tmaxprofit=Math.max(tmaxprofit,maxprize-p.get(i)+fprofits.get(i-1));
	    }
	    return tmaxprofit;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l,12,11,13,9,12,8,14,13,15);
		System.out.println(profit(l));
	}

}

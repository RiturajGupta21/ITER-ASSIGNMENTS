import java.util.*;
public class A3qno8 {
	static int toint(String s){
		Map<Character,Integer> m=new HashMap<Character,Integer>(){{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);}};
		int res=0;
		int n=s.length();
		for(int i=0;i<n;i++){
			if (i!=n-1&&m.get(s.charAt(i))<m.get(s.charAt(i+1))){
				res+=m.get(s.charAt(i + 1))-m.get(s.charAt(i));
				i++;
			}
			else
				res+=m.get(s.charAt(i));
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(toint("LIX"));
	}
}

import java.util.*;
class Insert{
	LinkedList <String> ls=new LinkedList <String>();
	Scanner sc=new Scanner(System.in);
	Insert(int n){
		for(int i=0;i<n;i++) {
			ls.add(sc.next());
		}
	}
}
public class A7qno4 {
	static String str="";
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers character you want to input");
		int n=sc.nextInt();
		System.out.println("How many elements you want for the character");
		int m=sc.nextInt();
		Insert ins;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements for "+(i+1)+" input");
			ins=new Insert(m);
			String s=ins.ls.toString();
			String[] strArray= s.substring(1, s.length()-1).split(",");
		    Arrays.sort(strArray);
		    StringBuilder sb = new StringBuilder();
		    for (int j=0; j<strArray.length; j++){
		        sb.append(strArray[j]);
		        sb.append(" ");
		    }
		    s=sb.toString();
		    System.out.println("Enter the character for the given list of elements");
			dic.put(sc.next(),s);
		}
		for (String i : dic.keySet()) {
			  System.out.println(i+" "+dic.get(i));
		}
	}
}
import java.util.*;
import java.io.*;
import java.text.*;
class Align extends Format {
    private int c;
    public Align(int c) {
        this.c = c;
    }
    private List<String> input(String str) {
        List<String> l = new ArrayList<String>();
        if (str.equals(null))
            return l;
        for (int i = 0; i<str.length();i+=c) {
            int li=Math.min(i+c,str.length());
            l.add(str.substring(i, li)); 
        }
        return l;
    }
    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition ignore){
        List<String> l_str = input(obj.toString());
        ListIterator<String> it = l_str.listIterator();
        while (it.hasNext()) {
            String str = it.next(); 
            toAppendTo.append(str);
            toAppendTo.append("\n");
        }
        return toAppendTo;
    }
    public Object parseObject(String source, ParsePosition pos) {
        return source;
    }
}
public class A3qno1 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(new FileReader("Text.txt"));
		String str="";
		while(sc.hasNextLine()) {
			str+=sc.nextLine()+" ";
		}
		Align a=new Align(50);
		 try {
		      FileWriter fw = new FileWriter("Text.txt");
		      fw.write(a.format(str));
		      fw.close();
		      System.out.println("Successfully Aligned");
		    } catch (IOException e) {
		      System.out.println(e);
		 }
	}
}

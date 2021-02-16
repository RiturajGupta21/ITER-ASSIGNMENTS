import java.io.*;
import java.util.*;
public class A9qno3 {
	static int c=0;
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileWriter fw = new FileWriter("number.txt");
		System.out.println("Enter the number");
	    fw.write(sc.next());
	    fw.close();
	    FileReader fr=new FileReader("number.txt");
	    BufferedReader br=new BufferedReader(fr);
	    String str=br.readLine();
	    br.close();
	    char ch[]=str.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	int n=ch[i]-48;
	    	checkprime(n);
	    }
	    System.out.println(c);
	}
	static void checkprime(int n) {
		 boolean b=false;
		    for(int i=2;i*i<=n;++i) {
		      if (n%i==0) {
		        b=true;
		        break;
		      }
		    }
		    if(!b)
		    	c++;
	}
}

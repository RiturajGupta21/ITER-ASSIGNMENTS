import java.io.*;
import java.nio.file.*;
import java.util.*;
public class A9qno5 {
	public static void main(String[] args) throws IOException {
		File f=new File("Text.txt");
		String str= Files.readAllLines(Paths.get("Text.txt")).get(10);
		Scanner sc= new Scanner(f);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNextLine()) {
	         sb.append(sc.nextLine()+System.lineSeparator());
	      }
	      String c=sb.toString();
	      String nt="";
	      for(int i=0;i<5;i++) {
	    	  nt+="Added\n";
	      }
	      c=c.replaceAll(str, nt);
	      FileWriter fw=new FileWriter(f);
	      fw.append(c);
	      System.out.println("Modified");
	      fw.close();
	      sc.close();
   }
}
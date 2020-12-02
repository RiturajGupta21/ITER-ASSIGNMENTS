import java.util.regex.*;
public class A4qno7 {
	public static void main(String[] args) {
		//Greedy quantifier
//		The greedy matcher would match the longest text even if parts of 
//		matching text also match
        Pattern p = Pattern.compile(".*foo");
        Matcher m = p.matcher("xfooxxxxxxfoo");
       while (m.find())
            System.out.println("Greedy quantifier "+ m.start() +" to " +(m.end()-1));
       //Reluctant quantifier
//       Since the quantifier is reluctant, it matches the shortest part
//       of test with pattern. It processes one character at a time.
       Pattern p1 = Pattern.compile(".*?foo");
       Matcher m1 = p1.matcher("xfooxxxxxxfoo");
      while (m1.find())
           System.out.println("Reluctant quantifier "+ m1.start() +" to " +(m1.end()-1));
      	//Possessive quantifier
//      This quantifier matches as many characters as it can like 
//      greedy quantifier. But if the entire string doesn’t match, 
//      then it doesn’t try removing characters from end.
      Pattern p2 = Pattern.compile(".*+foo");
      Matcher m2 = p2.matcher("xfooxxxxxxfoo");
     while (m2.find())
          System.out.println("Possessive quantifier "+ m2.start() +" to " +(m2.end()-1));
	}
}

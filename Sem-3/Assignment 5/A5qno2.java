import java.util.*;
public class A5qno2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month[] = { 31,28,31,30,31,30,31,31,30,31,30,31};
	      System.out.println("Enter your date of birth(dd/mm/yy): ");
	      int cd,cm,cy,bd,bm,by;
	      bd=sc.nextInt();
	      bm=sc.nextInt();
	      by=sc.nextInt();
	      System.out.println("Enter your current date(dd/mm/yy): ");
	      cd=sc.nextInt();
	      cm=sc.nextInt();
	      cy=sc.nextInt();
	      if (bd>cd) { 
	            cm=cm-1; 
	            cd=cd+month[bm-1]; 
	        } 
	      if (bm>cm) { 
	            cy=cy-1; 
	            cm=cm+12; 
	        } 
	      int d=cd-bd; 
	      int m=cm-bm; 
	      int y=cy-by; 
	      System.out.println("Years: "+y+" Months: "+m+" Days: " +d); 
	}
}

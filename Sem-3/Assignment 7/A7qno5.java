import java.util.*;
class A7qno5 {
  static void add(ArrayList<ArrayList<Integer>> al, int u, int v) {
    al.get(u).add(v);
    al.get(v).add(u);
  }
  static void display(ArrayList<ArrayList<Integer>> al) {
    for (int i=0;i<al.size();i++) {
      System.out.print( (char)(65+i));
      for (int j=0;j<al.get(i).size();j++) {
    	  if (j!=0)
              System.out.print(" -> "+(char)(65+al.get(i).get(j)));
              else
                  System.out.print(" -> "+(char)(65+al.get(i).get(j)));
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter vertex size");
    int n=sc.nextInt();
    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(n);
    for (int i = 0;i<n; i++)
      al.add(new ArrayList<Integer>());
    System.out.println("Do you want to add yes else no");
    String condition=sc.next();
    while(true) {
    	if(condition.equals("yes")) {
    		System.out.println("Use 0 for A and 25 for Z");
    		add(al,sc.nextInt(),sc.nextInt());
    	}
    	else
    		break;
    	System.out.println("Do you want to add yes else no");
    	condition=sc.next();
    }
//    add(al,0,1);
//    add(al,0,2);
//    add(al,0,3);
//    add(al,1,2);
//    add(al,3,2);
    display(al);
  }
}
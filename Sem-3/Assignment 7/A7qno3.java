import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
class Stud{
	String Name;
	int age;
	int roll;
	Stud(String Name,int age,int roll){
		this.Name=Name;
		this.age=age;
		this.roll=roll;
	}
}
class Sort implements Comparator<Stud> { 
    public int compare(Stud a, Stud b) { 
        return a.roll-b.roll; 
    } 
} 
public class A7qno3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList <Stud> ll=new LinkedList<Stud>();
		System.out.println("Enter the number of Students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(new Stud(sc.next(),sc.nextInt(),sc.nextInt()));
		}
		 ll.sort(new Sort()); 
	        System.out.println("Sorted"); 
	        for (Stud s:ll) 
	        	System.out.println(s.Name+" "+s.age+" "+s.roll); 
	}
}
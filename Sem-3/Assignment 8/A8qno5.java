import java.util.*;
class MutableInteger{
	private int i;
	public void set(int i){
		this.i=i;
	}
	public int get(){
		return(i);
	}
	public void increment(int increment){
		i=i+increment;
	}
}
public class A8qno5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A First Number.");
		MutableInteger m=new MutableInteger();
		m.set(sc.nextInt());
		System.out.println("First Number "+m.get());
		System.out.println("Enter The Increment Number.");
		m.increment(sc.nextInt());
		System.out.println("First Number "+m.get());
	}

}

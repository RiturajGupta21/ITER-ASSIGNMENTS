import java.util.*;
class nodeMax {
	public Integer ele;
	public Integer max;
	public nodeMax(int ele,int max) {
		this.ele=ele;
		this.max=max ;
	}
}
public class A5qno1 {
	static Deque<nodeMax>list=new LinkedList<>();
	public static boolean empty() {
		return list.isEmpty();
	}
	public static int max() {
		if (empty()){
			throw new IllegalStateException("Stack is empty");
		}
		return list.peek().max ;
	}
	public static int pop() {
		if (empty()){
			throw new IllegalStateException("Stack is empty");
		}
		return list.removeFirst().ele;
	}
	public static void push(int x) {
		list.addFirst(new nodeMax(x,Math.max(x,empty()?x:max())));
	}
	public static void main(String args[]) {
		A5qno1 ms=new A5qno1();
		ms.push(10);
		ms.push(13);
		ms.push(11);
		System.out.println(ms.max());
	}
}
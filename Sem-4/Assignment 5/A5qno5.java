import java.util.*;
public class A5qno5<Integer extends Comparable <Integer>> {
	Queue<Integer> Q=new LinkedList<>();
	Deque<Integer> D=new LinkedList<>();
	public void enqueue(Integer x) {
		Q.add(x);
		while (!D.isEmpty()){
			if (D .getLast().compareTo(x) >=0)
				break ;
			D.removeLast();
		}
		D.addLast(x);
	}
	public Integer dequeue(){
		if (!Q.isEmpty()){
			Integer result = (Integer) Q.remove();
			if (result.equals(D.getFirst()))
				D.removeFirst();
			return result;
		}
		throw new NoSuchElementException("Called dequeueQ on empty queue.");
	}
	public Integer max() {
		if (!D.isEmpty())
			return D.getFirst();
		throw new NoSuchElementException("empty queue");
	}
	public static void main(String args[]) {
		A5qno5 q=new A5qno5();
		q.enqueue(10);
		q.enqueue(20);
		System.out.println(q.max());
		System.out.println(q.dequeue());
		System.out.println(q.max());
	}
}

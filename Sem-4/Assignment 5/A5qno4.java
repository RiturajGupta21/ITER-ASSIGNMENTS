import java.util.*;
public class A5qno4 {
	Deque<Integer> enq=new LinkedList<>();
	Deque<Integer> deq=new LinkedList<>();
	public void enqueue(int x) {
		enq.addFirst(x);
	}
	public int dequeue() {
		if (deq.isEmpty()){
			while (!enq.isEmpty())
				deq.addFirst(enq.removeFirst());
		}
		if (!deq.isEmpty())
			return deq.removeFirst();
		throw new NoSuchElementException("Cannot pop empty queue");
	}

	public static void main(String[] args) {
		A5qno4 q=new A5qno4();
		q.enqueue(10);
		q.enqueue(20);
		System.out.println(q.enq);
		System.out.println(q.dequeue());
		System.out.println(q.deq);
	}

}

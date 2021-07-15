import java.util.*;
public class A5qno3 {
	int head=0,tail=0,numQueueElements=0;
	static final int SCALE_FACTOR=2;
	Integer [] entries;
	public A5qno3(int capacity) {
		entries = new Integer [capacity] ; 
	}
	public void enqueue(Integer x) {
		if (numQueueElements == entries.length) {
			Collections.rotate(Arrays.asList(entries),-head);
			head=0;
			tail=numQueueElements ;
			entries=Arrays.copyOf(entries,numQueueElements*SCALE_FACTOR);
		}
		entries[tail] = x;
		tail = (tail + 1) % entries.length ;
		++numQueueElements ;
	}
	public Integer dequeue(){
		if (numQueueElements!=0) {
			--numQueueElements ;
			Integer ret = entries[head];
			head = (head + 1) % entries.length ;
			return ret;
		}
		throw new NoSuchElementException("Dequeue called on an empty queue.");
	}
	public int size() {
		return numQueueElements;
	}

	public static void main(String[] args) {
		A5qno3 q=new A5qno3(5);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(20);
		int n=q.size();
		for(int i=0;i<n;i++) {
			System.out.print(q.entries[i]+" ");
		}
		System.out.println();
		q.dequeue();
		n=q.size();
		for(int i=0;i<n;i++) {
			System.out.print(q.entries[i]+" ");
		}
	}
}

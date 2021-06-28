public class Node {
	int data;
	Node next;
	Node() {}
	Node(int data) {
		this.data=data;
	}
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	public static void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}

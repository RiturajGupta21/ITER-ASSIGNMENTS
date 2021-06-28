public class A4qno8 {
	public static Node listPivoting(Node head, int k) {
		Node l=new Node(0,null);
		Node e=new Node(0,null);
		Node g=new Node(0,null);
		Node l1=l;
		Node e1=e;
		Node g1=g;
		Node newnode=head;
		while (newnode!=null) {
			if (newnode.data<k) {
				l1.next=newnode;
				l1=newnode;
			}
			else if (newnode.data==k) {
				e1.next=newnode;
				e1=newnode;
			}
			else {
				g1.next=newnode;
				g1=newnode;
			}
			newnode=newnode.next;
		}
		g1.next=null;
		e1.next=g.next ;
		l1.next=e.next ;
		return l.next ;
	}
	public static void main(String[] args) {
		Node head=null;
		head=new Node(1,head);
		head=new Node(4,head);
		head=new Node(5,head);
		head=new Node(3,head);
		head=new Node(2,head);
		head=new Node(5,head);
		Node.display(head);
		head=listPivoting(head,3);
		Node.display(head);
	}

}

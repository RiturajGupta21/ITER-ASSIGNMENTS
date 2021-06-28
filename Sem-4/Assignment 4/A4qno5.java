public class A4qno5 {
	public static Node removekth(Node head, int n) {  
		int size=0;
		Node currNode=head;
		while(currNode!=null){
			size++;
			currNode=currNode.next;
		}
		size-=n;
		if(size==0){
			head=head.next;
			return head;
		}
		Node temp=new Node();
		temp.next=head;
		while(size>=1){
			size--;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head; 
	}
	public static void main(String[] args) {
		Node head=null;
        for (int i=7;i>=1;i--) {
            head=new Node(i, head);
        }
        Node.display(head);
        removekth(head,3);
        Node.display(head);
	}
}

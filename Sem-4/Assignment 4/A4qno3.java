
public class A4qno3 {
	public static Node reverse(Node head,int s,int f){
		Node p=null;
		Node q=head;
		for (int i=1;q!=null&&i<s;i++){
			p=q;
		    q=q.next;
		 }
		Node start=q;
		Node end=null;
		for (int i=1;q!=null&&i<=f-s+1;i++){
			Node next=q.next;
		    q.next=end;
		    end=q;
		    q=next;
		  }
		  start.next=q;
		  if (p!=null)
		    p.next=end;
		  else 
		    head=end;
		  return head;
	}
	public static void main(String[] args) {
        int s=2,f=6;
        Node head = null;
        for (int i=7;i>=1;i--) {
            head=new Node(i, head);
        }
        Node.display(head);
        head=reverse(head,s,f);
        Node.display(head);
    }

}

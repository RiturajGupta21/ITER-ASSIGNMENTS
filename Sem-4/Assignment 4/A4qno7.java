public class A4qno7 {
	public static boolean isPalindrome(Node head) {
	    if(head == null)
	      return true;
	    Node rnode=reversedList(head);
	    Node temp= head;
	    Node rtemp=rnode; 
	    while(rtemp!=null){
	      if(temp.data!=rtemp.data)
	        return false;
	      temp=temp.next;
	      rtemp=rtemp.next;
	    }
	    return true;
	  }
	  public static Node reversedList(Node head){
	    Node rnode=new Node(head.data);
	    Node remnode=head.next;
	    rnode.next=null;
	    while(remnode!=null){ 
	      Node temp=new Node(remnode.data);
	      remnode=remnode.next;
	      temp.next=rnode;
	      rnode=temp;
	    }
	    return rnode;
	  }
	  public static void main(String[] args) {
			Node head=null;
			head=new Node(1,head);
			head=new Node(2,head);
			head=new Node(3,head);
			head=new Node(3,head);
			head=new Node(2,head);
			head=new Node(1,head);
			Node.display(head);
			if(isPalindrome(head))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
	}
}

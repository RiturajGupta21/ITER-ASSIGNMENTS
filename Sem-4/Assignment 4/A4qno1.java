import java.util.*;
public class A4qno1 {
	static Scanner sc=new Scanner(System.in);
	public static void create (Node head){
		Node p,q;
	    p=head;
	    System.out.println("Enter the value");
	    p.data=sc.nextInt();
	    p.next=null;
	    System.out.println("Do u want to add another node [yes-1,no-0]");
	    int option=sc.nextInt();
	    while(option!=0){
	    	q=new Node();
	    	System.out.println("Enter the value");
	    	q.data=sc.nextInt();
	    	q.next=null;      
	    	p.next=q;
	    	p=q;
	    	System.out.println("Do u want to add another node [yes-1,no-0]");
	    	option=sc.nextInt();
	    }
	   System.out.println("Linked List is created successfully");
	}
	public static Node InsBeg(Node head){
		Node p;
		p=new Node();
		System.out.println("Enter the value");
		p.data=sc.nextInt();
		p.next=null;
		if(head==null){
			head=p;
		}
		else{
			p.next=head;
			head=p;
		}
		return head;
	}
	public static Node InsEnd(Node head){
		Node p,q;
		p=new Node();
		System.out.println("Enter the value");
		p.data=sc.nextInt();
		p.next=null;
		if(head==null)
			head=p;
		else{
			q=head;
		while(q.next!=null)
			q=q.next;
		q.next=p;   
		}
		return head;
	}
	public static Node InsAfter(Node head){
		Node p,q;
		System.out.println("Enter the value after which you want to insert");
		int n=sc.nextInt();
		int flag=0;
		q=head;
		while(q!=null){
			if(q.data==n){
				flag=1;
				break;
			}
			q=q.next;
		}
		if(flag==1){
			p=new Node();
			System.out.println("Enter name of the new value");
			p.data=sc.nextInt();
			p.next=q.next;
			q.next=p;
		}
		else
			System.out.println("Node is not found");
		return head;
	}
	public static Node DelBeg(Node head){
		Node p;
		if(head==null){
			System.out.println("Linked List is empty");
		    System.exit(0);
		}
		else{
		    p=head;
		    head=head.next;
		    p.next=null;
		}
		return head;
	}
	public static Node DelEnd(Node head){
		Node p,q;
		q=null;
		if(head==null){
			System.out.println("Linked List is empty");
			System.exit(0);
		}
		else{
			p=head;
			while(p.next!=null){
				q=p;
				p=p.next;
			}
			q.next=null;
		}
		return head;
	}
	public static Node DelSpecific(Node start){
		Node p,q;
		q=null;
		if(start==null){
			System.out.println("The Linked List is empty");
		    System.exit(0);
			}
		else{
			System.out.println("Enter the value to be deleted:");
			int n=sc.nextInt();
			p=start;
			while(p!=null){
				if(p.data==n)
					break;
			       q=p;
			       p=p.next;
			}
			q.next=p.next;
			p.next=null;
		}
		return start;
	}
	public static void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node head=new Node();
		while(true){
		System.out.println("******************MENU********************");
		System.out.println("0:Exit");
		System.out.println("1:Creation");
		System.out.println("2:Insert a node at beginning");	
		System.out.println("3:Insert a node at end");	
		System.out.println("4:Insert after a given node");
		System.out.println("5:Delete a node from beginning");
		System.out.println("6:Delete a node from end");
		System.out.println("7:Delete a specific node");
		System.out.println("8:Display");
		System.out.println("******************************************");
		System.out.println("Enter the choice:");
		int choice=sc.nextInt();
		switch(choice){
			case 0:
				System.exit(0);
			case 1:
				create(head);
				break;
			case 2:
				head=InsBeg(head);
				break;			
			case 3:
				head=InsEnd(head);
				break;			
			case 4:
				head=InsAfter(head);
				break;
			case 5:
				head=DelBeg(head);
				break;			
			case 6:
				head=DelEnd(head);
				break;
			case 7:
				head=DelSpecific(head);
				break;
			case 8:
				display(head);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}

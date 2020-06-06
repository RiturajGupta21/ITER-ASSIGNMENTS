import java.util.*; 
class Node{ 
	int info;
	Node next;
	}
public class A7qno2{ 
	public static Node insert(Node rear,Node front ){
		Scanner sc=new Scanner (System.in);
		Node n=new Node();
		System.out.println("Enter element");
		n.info=sc.nextInt();
		n.next=null;
		if (front==null)
			front=n;
		else{
			rear=front;
			while(rear.next!=null){
				rear=rear.next;
				}
			rear.next=n;
			}
		return front;
		}
	public static Node delete(Node rear,Node front){
		if(front==null)
			System.out.println("Queue is empty ");
		else{
			System.out.println("Element of which will be deleted "+front.info+" at "+ front);
			front=front.next;
			}
		return front;
		}
	public static void display (Node rear,Node front){
		rear=front;
		if(front==null){
			System.out.println("Queue is empty");
			}
		else{
			System.out.println("Queue Created");
			while(rear!=null){
				System.out.print(rear.info+" ");
				rear=rear.next;
				}
			}
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Node n=new Node();
		Node front=null;
		Node rear=n;
		while(true){
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			case 0:
				System.exit(0);
			case 1: 
				front=insert(rear,front);
				break;
			case 2:
				front=delete(rear,front);
				break;
			case 3:
				display(rear,front);
				break;
			default:
				System.out.println("Wrong choice");
				}
			System.out.println();
			}
		}
	}
import java.util.*; 
class Node{
	int info;
	Node next;
	}
public class A6qno2{
	public static Node push(Node top){
		Scanner sc=new Scanner(System.in);
		Node n=new Node();
		System.out.println("Enter element");
		n.info=sc.nextInt();
		if(top==null){
			top=n;
			n.next=null;
			}
		else{
			n.next=top;
			top=n;
			}
		return top;
		}
	public static Node pop(Node top){
		System.out.println("Element which will be deleted "+top.info);
		top=top.next;
		return top;
		}
	public static void display(Node top){
		if(top==null)
			System.out.println("List is empty.");
		else{
			System.out.println("List Created:");
			while(top!=null){
				System.out.print(top.info+" ");
				top=top.next;
				}
			}
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Node top;
		top=null;
		while(true){
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			case 0:
				System.exit(0);
			case 1:
				top=push(top);
				break;
			case 2:
				top=pop(top);
				break;
			case 3:
				display(top);
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println();
		}
	}
}
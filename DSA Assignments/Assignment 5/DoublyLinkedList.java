import java.util.*;
class Node {
	protected Node next;
	protected float mark;
	protected int regd_no; 
	protected Node prev;
} 
 public class DoublyLinkedList {  
	public static Node create(Node start,Node end){
		Scanner sc=new Scanner (System.in);
		char ch;
		do{
			Node n=new Node();
			System.out.println("Enter registration number and mark ");
			n.regd_no=sc.nextInt();
			n.mark=sc.nextFloat();
			n.next=null;
			if(start==null||end==null){
				start= end= n;
				}
			else {
				end.next=n;
				n.prev=end;
				end=n;
				}
			System.out.println("Enter Y to add next value of node.");
			ch=sc.next().charAt(0);
			}
		while(ch=='Y');
		return start;
		}
public static Node insBeg(Node start,Node end)  {
		Scanner sc=new Scanner (System.in);
		Node n=new Node();
		System.out.println("Enter registration number and mark ");
		n.regd_no=sc.nextInt();
		n.mark=sc.nextFloat();
		n.prev=null;
		n.next=start;
		start=n;
		return start;
		} 
 public static Node insEnd(Node start,Node end) {
	 Scanner sc=new Scanner (System.in);
	 Node n=new Node();
	 end=new Node();
	 n=start;
	 System.out.println("Enter registration number and mark ");
	 end.regd_no=sc.nextInt();
	 end.mark=sc.nextFloat();
	 end.next=null;
	 end.prev=null;
	 while(n.next!=null){
		 n=n.next;
	 }
	 n.next=end;
	 end.prev=n;
	 return start;
	} 
 public static Node insAny(Node start,Node end){
	 Scanner sc=new Scanner (System.in); 
	 Node n=start;
	 Node a=new Node();
	 System.out.println("Enter registration number and mark ");
	 a.regd_no=sc.nextInt();
	 a.mark=sc.nextFloat();
	 System.out.println("Enter location");
	 int l=sc.nextInt();
	 for(int i=1;i<l-1 && n.next!=null;i++){
		 n=n.next;
		 }
	 a.prev =n;
	 a.next=n.next;
	 n.next.prev=a;
	 n.next=a;
	 return start;
	 } 
 public static Node delBeg(Node start,Node end){
	 System.out.println("Node to be deleted "+start.regd_no+" "+start.mark+ "at"+ start);
	 start=start.next;
	 start.prev=null;
	 return start;
	 }
 public static Node delEnd(Node start,Node end){
	 Node n=start;
	 end=new Node();
	 while(n.next!=null){
	 end=n;
	 n=n.next;
	 }
	 n.prev=null;
	 end.next=null;
	 System.out.println("Node to be deleted "+n.regd_no+" "+n.mark+ "at"+ start);
	 return start;
	 }
 public static Node delAny(Node start,Node end){
	 Scanner sc=new Scanner (System.in);
	 Node n=start;
	 Node a=new Node();
	 System.out.println("Enter location.");
	 int l=sc.nextInt();
	 for(int i=1;i<l && n.next!=null;i++){
		 a=n;
		 n=n.next;
		 }
	 System.out.println("Element to be deleted "+n.regd_no+" "+n.mark+" at "+n);
	 a.next=n.next;
	 n.next.prev=a;
	 return start;
	 }
public static void search(Node start,Node end){
	Node n=start;
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter registration number to be searched");
	 int r=sc.nextInt();
	 while(n!=null){
		 if(r==n.regd_no){
			 System.out.print("Enter updated marks.");
			 n.mark=sc.nextFloat();
			 }
		 n=n.next;
		 }
	 }
 public static void display(Node start,Node end){
	 Node n=start;
	 System.out.println(end);
	 if(start==null)
		 System.out.println("List is empty");
	 else{
		 System.out.println("List Created");
		 while(n!=null){
			 System.out.print("Regd no "+n.regd_no+" Mark- "+n.mark);
			 n=n.next;
			 }
		 }
	 }
 public static void main(String[] args) {
	 int c;
	 Scanner sc=new Scanner (System.in);
	 Node n=new Node();
	 Node start=n;
	 Node end=null;
	 while(true)   {
		 System.out.println("****MENU*****");
		 System.out.println("0:Exit");
		 System.out.println("1:Creation");
		 System.out.println("2:Display");
		 System.out.println("3:Insert at beg");
		 System.out.println("4:Insert at end");
		 System.out.println("5:Insert at specific location"); 
		 System.out.println("6:Search");
		 System.out.println("7:Delete at beg");
		 System.out.println("8:Delete at end");
		 System.out.println("9:Delete at specific location");
		 System.out.println("Enter the choice");
		 c=sc.nextInt();
		 switch(c)   {
		 case 0:
			 System.exit(0);
			 case 1:
				 start=create(start,end);
				 break;
			 case 2:
				 display(start,end);
				 break;
			 case 3:
				 start=insBeg(start,end);
				 break;
			 case 4:
				 start=insEnd(start,end);
				 break; 
			 case 5:
				 start=insAny(start,end);
				 break;   
			 case 6:
				 search(start,end);
				 break;
			 case 7:
				 start=delBeg(start,end);
				 break;
			 case 8:
				 start=delEnd(start,end);
				 break;
			 case 9:
				 start=delAny(start,end);
				 break; 
			 default:
				 System.out.println("Wrong choice");
				 }
		 }
	 }
 }
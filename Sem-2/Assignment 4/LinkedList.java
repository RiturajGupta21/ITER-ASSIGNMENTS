
import java.util.*;
class Node
{
protected int regd_no;
protected float mark;
protected Node next;
}
public class LinkedList
{
public static void create(Node start)
{
Node p,q;
Scanner sc=new Scanner(System.in);
p=start;
System.out.println("Enter registration no. & mark of the student:");
p.regd_no=sc.nextInt();
p.mark=sc.nextFloat();
p.next=null;
System.out.println("Do You Want To Add Another Node(YES-1,NO-0)");
int option=sc.nextInt();
while(option!=0)
{
q=new Node();
System.out.println("Enter registration no. & mark of the student:");
q.regd_no=sc.nextInt();
q.mark=sc.nextFloat();
q.next=null;
p.next=q;
p=q;
System.out.println("Do You Want To Add Another Node(YES-1,NO-0)");
option=sc.nextInt();
}
}
public static void display(Node start)
{
while(start!=null)
{
	System.out.println(start.regd_no+"  "+start.mark);
	start=start.next;
}
}
public static Node InsBeg(Node start)
{
	Scanner sc=new Scanner(System.in);
	Node curr;
	curr=new Node();
	System.out.println("Enter registration no. & mark of the student:");
	curr.regd_no=sc.nextInt();
	curr.mark=sc.nextFloat();
	curr.next=null;
	if(curr==null)
	{
		System.out.println("Memory Underflow");
		System.exit(0);
	}
	if(start==null)
	{
		start=curr;
	}
	else
	{
		curr.next=start;
		start=curr;
	}
	return start;
}
public static Node InsEnd(Node start)
{
	Scanner sc=new Scanner(System.in);
	Node curr,ptr;
	curr=new Node();
	if(curr==null)
	{
		System.out.println("Memory Underflow");
		System.exit(0);
	}
	System.out.println("Enter registration no. & mark of the student:");
	curr.regd_no=sc.nextInt();
	curr.mark=sc.nextFloat();
	if(start==null)
	{
		start=curr;
	}
	else
	{
		ptr=start;
	while(ptr.next!=null)
	{
		ptr=ptr.next;
	}
	ptr.next=curr;   
	}
	return start;
}
public static Node InsAny(Node start)
{
	Scanner sc=new Scanner(System.in);
	Node curr,p;
	int i=1,c=0,loc;
	p=start;
	System.out.println("Enter the Location");
	loc=sc.nextInt();
	while(p!=null)
	{
		c++;
		p=p.next;
    }
	if(loc==1)
		start=InsBeg(start);
	else
	if(loc==c+1)
		start=InsEnd(start);
	else
	{
		p=start;
		while(i<loc-1)
		{
			p=p.next;
			i++;
		}
		curr=new Node();
		System.out.println("Enter the registration no. & marks of the student");
		curr.regd_no=sc.nextInt();
		curr.mark=sc.nextFloat();
		curr.next=p.next;
		p.next=curr;
	}
    return start;
}

public static void search(Node start)
{
	Node p,q;
	q=null;
	if(start==null)
		{
		System.out.println("Memory Underflow");
	    System.exit(0);
		}
	else
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student's registration no whose mark to be updated");
		int item=sc.nextInt();
		p=start;
		while(p!=null)
		{
			if(p.regd_no==item)
				{
				break;
				}
			p=p.next;
		}
		System.out.println("Enter the updated mark");
		p.mark=sc.nextFloat();
		System.out.println("Node Found & Mark Updated");
		}
}

public static void main(String[] args) {
Node start=new Node();
	while(true)
{
System.out.println("******************MENU********************");
System.out.println("0:Exit");
System.out.println("1:Creation");
System.out.println("2:Display");
System.out.println("3:Insertion at the beginning of the list");
System.out.println("4:Insertion at the end of the list");
System.out.println("5:Insertion at any location of the list");
System.out.println("6:Search a node based on regd_no and update its mark");
System.out.println("******************************************");
System.out.println("Enter the choice:");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
switch(choice)
{
case 0:
System.exit(0);
case 1:
create(start);
break;
case 2:
display(start);
break;
case 3:
start=InsBeg(start);
break;
case 4:
start=InsEnd(start);
break;
case 5:
start=InsAny(start);
break;
case 6:
search(start);
break;
default:
System.out.println("Wrong choice");
}
}
}
}

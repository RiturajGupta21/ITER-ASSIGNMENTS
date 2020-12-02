import java.util.Scanner;
class Node
{
   String name;
   Node link;
}


public class LinkedList {
	
	
	public static void create (Node start)
	{
		
		Scanner sc=new Scanner(System.in);
	    Node p,q;
	    p=start;
	    System.out.println("Enter name of the  student");
	    p.name=sc.next();
	    p.link=null;
	    System.out.println("Do u want to add another node [yes-1,no-0]");
	       int option=sc.nextInt();
	       while(option!=0)
	       {
	       q=new Node();
	       System.out.println("Enter name of the student");
	       q.name=sc.next();
	       q.link=null;      
	       p.link=q;
	       p=q;
	       System.out.println("Do u want to add another node [yes-1,no-0]");
	       option=sc.nextInt();
	       }
	       
	       System.out.println("Linked List is created successfully");
	         
	}

	public static void display(Node start)
	{
	Node temp=start;
	while(temp!=null)
	{
		System.out.println(temp.name);
		temp=temp.link;
	}
	}
	
	
	public static Node search(Node start)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name you want to search");
		String name=sc.next();		
		Node p=start;
		while(p!=null)
		{
			if(p.name.equalsIgnoreCase(name))
				return p;
			p=p.link;
		}
		return null;
		}
		
	
	
public static Node searchLast(Node start)
	
	{
	    if(start==null)
	    {
	    	System.out.println("Linked List is empty");
	    	return null;
	    }
	    
	    else
	    {
	    	
	    	Node p=start;
		    
			while(p.link!=null)
			{
				p=p.link;
			}
			return p;
	    }
		
		
	}

public static Node searchPrevious(Node start)
{
	
	if(start==null)
	{
		System.out.println("Linked List is empty");
		return null;
	}
	
	else
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name part of the node whose previous node to be searched");
	String name1=sc.next();	
	Node p=start;
	Node q=null;
	while(p!=null)
	{
		if(p.name.equalsIgnoreCase(name1))
		{
			return q;
		}
		q=p;
		p=p.link;
	}
	q=null;
	return q;
		
	}
}

public static Node searchSecondLast(Node start)

{
    if(start==null)
    {
    	System.out.println("Linked List is empty");
    	return null;
    }
    
    else
    {
    	
    	Node p=start;
	    
		while(p.link.link!=null)
		{
			p=p.link;
		}
		return p;
    }
	
	
}
	

public static Node InsBeg(Node start)
{
	Scanner sc=new Scanner(System.in);
	Node p;
	p=new Node();
	System.out.println("Enter the name of new student");
	p.name=sc.next();
	p.link=null;
	if(start==null)
	{
		start=p;
	}
	else
	{
		p.link=start;
		start=p;
	}
	return start;
}


public static Node InsEnd(Node start)
{
	Scanner sc=new Scanner(System.in);
	Node p,q;
	p=new Node();
	System.out.println("Enter the name of new student");
	p.name=sc.next();
	p.link=null;
	if(start==null)
	{
		start=p;
	}
	else
	{
		q=start;
	while(q.link!=null)
	{
		q=q.link;
	}
	q.link=p;   
	}
	return start;
}


public static Node InsAfter(Node start)
{
	
	Scanner sc=new Scanner(System.in);
	Node p,q;
	
	System.out.println("Enter the name of the student after which you want to insert");
	String n=sc.next();
	int flag=0;
	
	q=start;
    
	while(q!=null)
	{
		if(q.name.equalsIgnoreCase(n))
		{
			flag=1;
			break;
		}
		q=q.link;
	}
	if(flag==1)
	{
		p=new Node();
		System.out.println("Enter name of the new student");
		p.name=sc.next();
		p.link=q.link;
		q.link=p;
	}
	else
	{
		System.out.println("Node is not found");
	}
	
	
	
	return start;

}
	
public static Node DelBeg(Node start)
{
	Node p;
	if(start==null)
		{
		System.out.println("Linked List is empty");
	    System.exit(0);
		}
	else
	{
	    p=start;
	    start=start.link;
	    p.link=null;
	}
	    return start;
}


public static Node DelEnd(Node start)
{
	Node p,q;
	q=null;
	if(start==null)
		{
		System.out.println("Linked List is empty");
	    System.exit(0);
		}
	else
	{
		p=start;
		while(p.link!=null)
		{
			q=p;
			p=p.link;
		}
		q.link=null;
	}
	return start;
}


public static Node DelSpecific(Node start)
{
	Node p,q;
	q=null;
	if(start==null)
		{
		System.out.println("The Linked List is empty");
	    System.exit(0);
		}
	else
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student to be deleted:");
		String n=sc.next();
		p=start;
		while(p!=null)
		{
			if(p.name.equalsIgnoreCase(n))
				break;
		       q=p;
		       p=p.link;
		}
		q.link=p.link;
		p.link=null;
		}
	return start;
}


public static Node sort(Node start)
{
	Node ptr1,ptr2;
	String temp;
	for(ptr1=start;ptr1!=null;ptr1=ptr1.link)
	{
		for(ptr2=ptr1.link;ptr2!=null;ptr2=ptr2.link)
		{
			if(ptr1.name.compareTo(ptr2.name)>0)
			{
				temp=ptr1.name;
				ptr1.name=ptr2.name;
				ptr2.name=temp;
				}
		}	
	}
	return start;
}


public static Node reverse(Node start)
{
	Node ptr1,ptr2,ptr3;
	ptr1=null;
	ptr2=start;
	ptr3=ptr2.link;
	ptr2.link=null;
	while(ptr3!=null)
	{
		ptr1=ptr2;
		ptr2=ptr3;
		ptr3=ptr3.link;
		ptr2.link=ptr1;
	}
	start=ptr2;
	return start;
}



	
	public static void main(String[] args)
		{
		Node start=new Node();
		while(true)
		{
		System.out.println("******************MENU********************");
		System.out.println("0:Exit");
		System.out.println("1:Creation");
		System.out.println("2:Display");
		System.out.println("3:Search");
		System.out.println("4:Search Last node");
		System.out.println("5:Search Previous node");
		System.out.println("6:Search Second Last node");
		System.out.println("7:Insert a node at beginning");	
		System.out.println("8:Insert a node at end");	
		System.out.println("9:Insert after a given node");
		System.out.println("10:Delete a node from beginning");
		System.out.println("11:Delete a node from end");
		System.out.println("12:Delete a specific node");
		System.out.println("13:Sort the elements based on node value");
		System.out.println("14:Reverse the singly linked list");
		
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
			Node res=search(start);
			if(res!=null)
			{
				System.out.println(res.name+" is found");
			}
			else
			{
				System.out.println("name is not found");
			}
			
			break;
			
		case 4:
			Node res1=searchLast(start);
			if(res1!=null)
			{
				System.out.println("Last node is found and the info part is "+res1.name);
			}
			else
			{
				System.out.println("Last node is not found");
			}
			
			break;
			
			
		case 5:
			Node res2=searchPrevious(start);
			if(res2!=null)
			{
				System.out.println("Previous node is found and the info part is "+res2.name);
			}
			else
			{
				System.out.println("Previous node is not found");
			}
			
			break;
			
			
		case 6:
			Node res3=searchSecondLast(start);
			if(res3!=null)
			{
				System.out.println("Second Last node is found and the info part is "+res3.name);
			}
			else
			{
				System.out.println(" Second Last node is not found");
			}
			
			break;
			
		case 7:
			start=InsBeg(start);
			break;
			
		case 8:
			start=InsEnd(start);
			break;
			
		case 9:
			start=InsAfter(start);
			break;
			
		case 10:
			start=DelBeg(start);
			break;
			
		case 11:
			start=DelEnd(start);
			break;
		case 12:
			start=DelSpecific(start);
			break;
			
		case 13:
			start=sort(start);
			break;
			
		case 14:
			start=reverse(start);
			break;			
			
		default:
		System.out.println("Wrong choice");
		}
		}
		}

	}



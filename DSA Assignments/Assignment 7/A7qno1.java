import java.util.*; 
public class A7qno1 {
	public static void insert(int Q[]){
		if(isFull())
			System.out.println("Queue is Full");
		else{
			Scanner sc=new Scanner(System.in);
			System.out.println("Insert element to the queue");
			int ele=sc.nextInt();
			rear++;
			Q[rear]=ele;
			}
		if(rear==0)
			front=0; 
		}
public static void delete(int Q[]){
	if(isEmpty())
		System.out.println("Queue is Empty");
	else{
		int ele=Q[front];
		front++;
		System.out.println("Element to be deleted "+ele);
		}
	}
public static void display(int Q[]){
	if(isEmpty())
		System.out.println("Queue is Empty");
	else{
		System.out.println("Elements present in queue.");
		for(int i=front;i<=rear;i++){
			System.out.println(Q[i]);
			}
		}
	}
public static boolean isEmpty(){
	if(rear==-1||front==-1)
		return true;
	else
		return false;
	}
public static boolean isFull(){
	if(rear==MAX-1)
		return true;
	else
		return false;
	}
public static final int MAX=5;
public static int front=-1;
public static int rear=-1;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int queue[]=new int[MAX];
	while(true)
	{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)  {
		case 0:
			System.exit(0);
		case 1:
			insert(queue);
			break;
		case 2:
			delete(queue);
			break;	
		case 3:
			display(queue);
			break;
		default:
			System.out.println("Invalid choice");  
			}
		}
	}
} 
import java.util.*;
public class A6qno1{
	public static int push(int S[],int top){
		if(isFull(top))
			System.out.println("Stack is Full ");
		else{ 
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter element");
			int e= sc.nextInt();
			top++;
			S[top]=e;
			}
		return top;
		}
	public static int pop(int S[],int top){
		if(isEmpty(top))
			System.out.println("Stack Underflow ");
		else{
			int e= S[top];
			top--;
			System.out.println("Deleted Element is "+e);
			}
		return top;
		}
	public static void display(int S[],int top){
		if(isEmpty(top))
			System.out.println("Stack is Empty ");
		else{
			System.out.println("Element present in stack");
			for(int i=top;i>=0;i--){
				System.out.println(S[i]);
				}
			}
		}
	public static boolean isEmpty(int top){
		if(top==-1)
			return true;
		else
			return false;
		}
	public static boolean isFull(int top){
		if(top==(MAX-1))
			return true;
		else
			return false;
		}
	public static final int MAX=10;
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int stack[]=new int [MAX];
		int top=-1;
		while(true){
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			case 0:
				System.exit(0);
			case 1:
				top=push(stack,top);
				break;
			case 2:
				top=pop(stack,top);
				break;
			case 3:
				display(stack,top);
				break;
			default:
				System.out.println("Invalid choice");
				} 
			}
		}
	}
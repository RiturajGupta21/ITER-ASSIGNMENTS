import java.util.Scanner;
class Process {
	static int bal=0;
	static int deposit,withdraw;
	static Scanner sc = new Scanner(System.in);
	
	static void deposit() {
		System.out.print("Enter ammount to deposited ");
        deposit = sc.nextInt();
        bal= bal+deposit;
        System.out.println("Ammount Deposited");
        System.out.println();
	}
	
	static void withdraw() {
		System.out.print("Enter ammount to withdraw ");
        withdraw = sc.nextInt();
        if(bal>= withdraw){
            bal=bal-withdraw;
            System.out.println("Ammount Withdrawn");
            System.out.println();
        }
        else{
            System.out.println("Insufficient Balance");
            System.out.println();
        }
	}
	
	static void balance() {
		System.out.println("Balance "+bal);
		System.out.println();
	}
}
public class A1qno7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        while(true){
		        System.out.println("1 for Deposit");
		        System.out.println("2 for Withdraw");
		        System.out.println("3 for Balance");
		        System.out.println("4 for Exit");
		        int ch=sc.nextInt();
	        	switch(ch){
	        	case 1:
	        		Process.deposit();
	                 break;
	        	case 2:
	        		Process.withdraw();
	                break;
	        	case 3:
	                Process.balance();
	                break;
	        	case 4:
	                System.exit(0);
	        	}
	        }
	}
}


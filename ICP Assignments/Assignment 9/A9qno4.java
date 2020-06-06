import java.util.Date;

class Account { 
	private int id;
	private double balance; 
	private static double annualInterestRate;
	private Date dateCreated;
Account() { 
	id = 0; 
	balance = 0;
	annualInterestRate = 0;
	dateCreated = new Date(); 
	}
Account(int newId, double newBalance) { 
	id = newId;
	balance = newBalance;
	dateCreated = new Date(); 
	}
public void setId(int newId) {
	id = newId; 
	}
public void setBalance(double newBalance) {
	balance = newBalance; 
	}
public void setAnnualInterestRate(double newAnnualInterestRate) {
	annualInterestRate = newAnnualInterestRate;
	}
public int getId() {
	return id;
	}
public double getBalance() {
	return balance;
	}
public double getAnnualInterestRate() { 
	return annualInterestRate;
}
public String getDateCreated() { 
	return dateCreated.toString();
	}
public double getMonthlyInterestRate() {
	return annualInterestRate / 12;
	}
public double getMonthlyInterest() {
	return balance * (getMonthlyInterestRate() / 100);
	}
public void withdraw(double amount) {
	balance -= amount; 
	}
public void deposit(double amount) { 
	balance += amount;
	}
} public class A9qno4 { 
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account Statement");
		System.out.println("Account ID" + account.getId());
		System.out.println("Date created" + account.getDateCreated());
		System.out.println("Balance"+account.getBalance());
		System.out.printf("Monthly interest"+ account.getMonthlyInterest());
		} 
	}
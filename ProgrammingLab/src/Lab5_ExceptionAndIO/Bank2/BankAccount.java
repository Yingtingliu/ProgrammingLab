package Lab5_ExceptionAndIO.Bank2;

public class BankAccount {
	private String customerName;
	private int accountNumber;
	private double balance;
	private static int nextAccountNumber = 0;
	public BankAccount(String customerName) {
		this.customerName = customerName;
		balance = 0.0;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	public int getAccoutNumber() {
		return accountNumber;
	}
	public String toString() {
		return customerName + " (" + accountNumber + ") £" + String.format("%8.2f",balance);
	}
	// part 2.5
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
}

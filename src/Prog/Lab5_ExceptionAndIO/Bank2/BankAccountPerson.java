package Prog.Lab5_ExceptionAndIO.Bank2;

import Lab5_ExceptionAndIO.OverdraftException;

public class BankAccountPerson {
	private Person customer;
	private int accountNumber;
	private double balance;
	private static int nextAccountNumber = 0;
	public BankAccountPerson(Person customer) {
		this.customer = customer;
		balance = 0.0;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	public int getAccoutNumber() {
		return accountNumber;
	}
	public String toString() {
		return customer.getName() + " (" + accountNumber + ") £" + String.format("%8.2f",balance);
	}
	// part 2.5
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws OverdraftException {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	// Exercise 2.10
	public void transferFunds(BankAccountPerson other, double amount) throws OverdraftException {
		// transfers amount from other to this account
		other.withdraw(amount);
		deposit(amount); // neater to use this than manipulate balance directly
	}
}

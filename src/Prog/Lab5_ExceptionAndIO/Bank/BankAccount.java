package Prog.Lab5_ExceptionAndIO.Bank;

import Lab5_ExceptionAndIO.OverdraftException;

public class BankAccount {
	
//	private String name;
	//---Q8---
	private People p;
	private int accountNumber;
	private int balance;
	
	public static int nextAccountNumber = 0;
	
	
	public int BankAccount(People p) {
		this.p = p;
		balance = 0;
		return nextAccountNumber+1;
	}

	public int getAccountNumber() {
		return accountNumber;
	}	
	//---Q5---
	public int deposit (int deposit) {
		balance += deposit;
		return balance;
	}
	
	public int withdraw (int withdraw) throws OverdraftException {
		balance -= withdraw;
		return balance;
	}
	
//	---Q10???----
	public int transferFunds (int transferAmt) {
		
		return balance;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + p + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}		
	
}

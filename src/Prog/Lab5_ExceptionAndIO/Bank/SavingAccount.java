package Prog.Lab5_ExceptionAndIO.Bank;

import Lab5_ExceptionAndIO.OverdraftException;

public class SavingAccount extends BankAccount{
	
	
	private int balance;	
	private double interestRate;
	
	public SavingAccount() {
		super();		
	}	
	

	public SavingAccount(double interestRate) {
		super();		
		this.interestRate = interestRate;
	}
	
	//the type here is double!!!!
	public double addInterest(double interestRate) {
		Double bal = interestRate/100.0 * Double.valueOf(balance); 
		
		return bal;
	}

	@Override
	public int withdraw(int withdraw) throws OverdraftException {
		
		balance = balance - withdraw;
		
		if(balance<0) {
			System.out.println("transaction failed!");
			throw new OverdraftException();
		}
		else {	
			return super.withdraw(withdraw);			
		}		

	}


	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + "]";
	}

}

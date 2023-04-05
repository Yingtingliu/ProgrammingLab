package Prog.Lab;

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
	public int withdraw(int withdraw) {
		if(withdraw>balance) {
			System.out.println("transaction failed!");
			return balance;
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

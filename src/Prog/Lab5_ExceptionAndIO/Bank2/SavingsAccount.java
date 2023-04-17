package Prog.Lab5_ExceptionAndIO.Bank2;

import Prog.Lab5_ExceptionAndIO.OverdraftException;

public class SavingsAccount extends BankAccountPerson{
	private double ir; //interest rate
	public SavingsAccount(Person customer, double ir) {
		super(customer);
		this.ir = ir;
	}
	@Override
	public void withdraw(double amount) throws OverdraftException {
		/*
		 * balance is private, so here I call getBalance of the super class
		 * an alternative would be to make balance public (NOOOO) or make it
		 * protected and therefore visible here.
		 * The same applies where I have used the withdraw and deposit methods
		 * of the super class throughout.
		 */
		double currentBalance = 0;
		try {
			currentBalance = super.getBalance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(amount <= currentBalance) { // we can withdraw
			super.withdraw(amount); // easiest way to  do it
		}else {
//			System.out.println("Insufficent funds to withdraw");
			OverdraftException exp = new OverdraftException();
			throw exp;
		}
	}
	public void addInterest() {
		double currentBalance = super.getBalance();
		// Compute the interest to pay
		double interest = currentBalance * ir / 100.0;
		// Add it to the balance
		super.deposit(interest);
	}
	
	public static void main(String[] args) {
		// demonstrate some things
		Person s = new Person("Simon", 10, "Blue");
		Person t = new Person("Boris", 99,"Blue");
		BankAccountPerson b = new BankAccountPerson(s);
		b.deposit(500.0);
		System.out.println(b);
		
		/*
		 *  We can pass a Student to SavingsAccount. It expects
		 *  something of type Person. But Student is ok, as it is a 
		 *  subclass of Person
		 */
		
		SavingsAccount sa = new SavingsAccount(t, 10.0);
		sa.deposit(100);
		sa.addInterest();
		
		/*
		 * We didn't write a toString method
		 * for SavingsAccount. So it uses the first
		 * one available when it looks up the class hierarchy.
		 * In this case, it'll be the one from Person.
		 */
//		System.out.println(sa);
//		
//		sa.withdraw(120.0); // Won't do it, because there is £110 in the account
//		System.out.println(sa);
//		
//		sa.withdraw(100.0); // This will work
//		System.out.println(sa);
//		
//		// Also we can use the transfer method, which will be inherited..
//		sa.transferFunds(b, 75.0);
//		System.out.println(sa);
		
	}
}

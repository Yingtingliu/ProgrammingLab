package Lab;

public class BankAccountMain {

	public static void main(String[] args) {
		
		//---Q4---
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		System.out.println(ba2.nextAccountNumber);
		System.out.println("-----");
		System.out.println(ba1.getAccountNumber()); 
		
		//---Q6---		
		System.out.println("Current balance 2 is: " + ba2.getBalance());
		// test Deposit
		ba2.deposit(100);
		System.out.println("Current balance 2 is: " + ba2.getBalance());
		// test Withdraw
		ba2.withdraw(20);
		System.out.println("Current balance 2 is: " + ba2.getBalance());
		
		//---Q7---
		People p1 = new People();
		
		//test
		SavingAccount sa1 = new SavingAccount();
		sa1.deposit(500);
		sa1.withdraw(600);
		System.out.println("SA1 balance is: " + sa1.getBalance());
		
//		polymorphism:
//		Objects can be referred to by references of their own type, or something higher up
//		the hierarchy.
		BankAccount bk2 = new SavingAccount();
		bk2.deposit(1500);
		System.out.println("------");
		System.out.println(bk2.toString());
		System.out.println("BK2 balance is: " + bk2.getBalance());
		
	}

}

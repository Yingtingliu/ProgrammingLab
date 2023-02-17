package DSA_Ch8_lecture.innerclass;

public class BankAccount {
	
	
	
	//// inner class ////
	private class Money{
		private long dollars; // instance variables
		private int cents;
		
		public Money(long d, int c){
			dollars = d;
			cents = c;
		}
		
		public String getAmount(){
			String centString;
			if(cents>9) centString = ""+ cents;
			else centString = "0" + cents;
			return(SIGN + dollars + "." + centString); //acccessing a variable from outer class
		}
		
	}
	
	/// outer class
	
	private Money balance; // instance variables
	private static final String SIGN = "$"; 
	
	public BankAccount(){
		balance = new Money(0,0); //creating an object of the inner class type
	}
	
	public void makeDeposit(long d, int c){
		balance.dollars+=d; //directly accessing instance variables of inner class
		balance.cents+=c;
	}
	
	public void outputBalance(){
		System.out.println(balance.getAmount());// directly accessing methods of inner class
	}
	
	

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.makeDeposit(30,5);
		myAccount.makeDeposit(45, 3);
		myAccount.outputBalance();

	}

}

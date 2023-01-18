package AP_Lab1;

public class Invoice implements Payable {
	
	int value;
	String desc;
	
	@Override
	public int calcPaymentAmount() {
		// TODO Auto-generated method stub
		return this.value;
	}

}

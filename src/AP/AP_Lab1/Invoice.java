package AP.AP_Lab1;

public class Invoice implements Payable {

	int value;
	String desc;

	@Override
	public int calcPaymentAmount() {
		
		return this.value;
	}

}

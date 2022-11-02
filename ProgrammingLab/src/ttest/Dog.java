package ttest;

public class Dog extends AnimalWithLegs {
	
	protected boolean cute;

	public Dog(int legs, boolean cute) {
		super(legs);
		this.cute = cute;
	}

//	public String toString() {
////		return "I have " + this.nLegs + " legs";
//	}
}

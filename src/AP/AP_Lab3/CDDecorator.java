package AP.AP_Lab3;

public class CDDecorator extends CarDecorator {	
	
	
	public CDDecorator(Car car) {
		super(car);		
	}	

	@Override
	public Double getPrice() {		
		return 150 + super.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() +" + CD Player" ;
	}

}

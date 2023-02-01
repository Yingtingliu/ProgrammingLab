package AP_Lab3;

public class AlloyDecorator extends CarDecorator {
	
	Car car;
	

	public AlloyDecorator(Car car) {
		super(car);		
	}	
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 250;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() +" + Alloys";
	}

}

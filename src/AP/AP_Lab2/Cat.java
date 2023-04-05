package AP.AP_Lab2;

public class Cat extends Pet{
	
	private String breed;
	private String furColour;
	private String favouriteSpot;

	public Cat(String name, int age, String breed, String furColour, String favouriteSpot) {
		super(name, age);
		this.breed = breed;
		this.furColour = furColour;
		this.furColour = furColour;
	}
	
	// overload
	public String toString(String breed, String furColour, String favouriteSpot) {
		return name +" is a " +breed +" and enjoys staying at " +favouriteSpot + "every day.";		
	}
	
}

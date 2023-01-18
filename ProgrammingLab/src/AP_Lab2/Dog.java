package AP_Lab2;

public class Dog extends Pet{
	
	private String breed;
	private String furColour;
	private String favouriteToy;
	
	public Dog(String name, int age,String breed, String furColour, String favouriteToy) {
		super(name, age);
		this.breed = breed;
		this.furColour = furColour;
		this.favouriteToy = favouriteToy;
	}
	
	public String provideBone() {
		return name + " says thanks for the bone!";
	}
	
	//overload
	public String toString(String breed, String furColour, String favouriteToy) {
		return name +" is a " +breed +" and enjoys playing with " +favouriteToy + "every day.";		
	}

}

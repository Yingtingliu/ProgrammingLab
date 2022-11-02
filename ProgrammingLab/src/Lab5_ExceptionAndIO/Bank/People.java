package Lab5_ExceptionAndIO.Bank;


public class People {
	
	private int age = 10;
	private String name = "Apple";
	
	public int changeAge( int age) {
		return age;
	}

	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + "]";
	}

}

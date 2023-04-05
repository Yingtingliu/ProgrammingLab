package SE.SE_Lab2_seit_2_2;

import java.io.PrintStream;

public class Person {
	
//	In general, internal details should be hidden
	private	String	name;
	Date dateOfBirth;
	
	public Person(String name, Date dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public void print(PrintStream ps) {
		ps.println("name: " + name + ", date of birth: " + dateOfBirth);
	}
		
	public String getName() {
		return name;
	}
	
	public int getAge(int currentYear) {
		return currentYear-this.dateOfBirth.getYear();
	}
			
}

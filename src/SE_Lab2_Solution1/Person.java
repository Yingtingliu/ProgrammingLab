package SE_Lab2_Solution1;

public class Person {	
	protected	String	name;
	protected	dob	birth_date;	// date of birth
	
	public	Person(String n, dob person_birth_date)	{
		name = n;
		birth_date = person_birth_date;		
	}	
	
	public String getName() {
		return this.name;
	}
	
	public dob getBirthDate() {
		return this.birth_date;
	}
		
}



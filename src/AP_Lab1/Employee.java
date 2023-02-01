package AP_Lab1;

public class Employee extends Person{
	
	int id;	
	int salary;
	String department;
	static int count = 1;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
		count++;
	}
	
	public void editName(String newName) {
		this.name = newName;		
	}

}

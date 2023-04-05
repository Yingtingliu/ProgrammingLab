package Prog.Lab;

public class Lecturer extends People {
	private double salary;	
	
	public Lecturer() {
		super();
	}

	public Lecturer(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Lecturer [salary=" + salary + "]";
	}		
}

package AP.AP_Lab1;

public class Manager extends Employee{
	
	int bonus;
		
	public Manager(String name, int salary, String department, int bonus) {
		
		super(name, salary, department);		
		this.bonus = bonus;
		
	}
	
	public int calcTotalEarnings() {
		
		int totalEarnings = this.bonus + this.salary;		
		return totalEarnings;
		
	}

}

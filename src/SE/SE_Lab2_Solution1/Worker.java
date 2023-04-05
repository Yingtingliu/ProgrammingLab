package SE.SE_Lab2_Solution1;

import java.io.PrintStream;

public class Worker extends Person {
	
	Boss boss = null;
	
	public Worker(String n, dob person_birth_date) { //constructor for class Boss
		super(n, person_birth_date); //invoking parent class Person constructor			
	}
	
	public void setBoss(Boss person_boss) {
		this.boss = person_boss;
	}
		

	public	void print(PrintStream ps)	{
		ps.print(String.format("%s: born on %02d/%02d/%4d", this.getName(), 
				this.getBirthDate().get_dob_day(), this.getBirthDate().get_dob_month(), 
				this.getBirthDate().get_dob_year()));	
		
		ps.print(" is bossed by "+boss.name);	
	}
	
}

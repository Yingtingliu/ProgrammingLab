package SE_Lab2_Solution1;

import java.io.PrintStream;

public class Boss extends Person {
	private	int	nworkers;
	private	Person[] worker;
	private static int max_nworkers = 10;
	
	public Boss(String n, dob person_birth_date) { //constructor for class Boss
		super(n, person_birth_date); //invoking parent class Person constructor
		nworkers = 0;
		worker = new Person[max_nworkers]; 
	}
	
	public void addWorker(Worker person_worker) {
		this.worker[nworkers++] = person_worker;
	}
	
	public void addAndSetWorker(Worker person_worker) {
		this.addWorker(person_worker);
		person_worker.setBoss(this);
	}
	
	public	void print(PrintStream ps)	{
		ps.print(String.format("%s: born on %02d/%02d/%4d", this.getName(), 
				this.getBirthDate().get_dob_day(), this.getBirthDate().get_dob_month(), 
				this.getBirthDate().get_dob_year()));	
		
		ps.print(" is boss of: ");
		for (int i = 0; i < nworkers; i++)
			ps.print(worker[i].name+" ");	
	}	
			
}

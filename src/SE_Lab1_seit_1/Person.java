package SE_Lab1_seit_1;
import java.io.PrintStream;

public class Person {
	
	private	String	name;
	private	int	dob_d, dob_m, dob_y;	// date of birth
	private	int	type;	// 1 = Boss, 2 = Worker
	private	Person	boss;
	private	Person[] worker;
	private	int	nworkers;
	
	public	Person(String n, int d, int m, int y)	{
		name = n;
		dob_d = d;
		dob_m = m;
		dob_y = y;
	
		boss = null;
		worker = null;
		nworkers = 0;
	}
	
	public	void print(PrintStream ps)	{
		
		ps.print(String.format("%s: born on %02d/%02d/%4d", getName(), getDob_d(), getDob_m(), getDob_y()));
		if (this.getNworkers() == 1)	{
			ps.print(" bosses: ");
			for (int i = 0; i < getNworkers(); i++)
				ps.print(getWorker()[i].getName()+" ");
		}
		else
			ps.print(" is bossed by "+getBoss().getName());
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob_d() {
		return dob_d;
	}

	public void setDob_d(int dob_d) {
		this.dob_d = dob_d;
	}

	public int getDob_m() {
		return dob_m;
	}

	public void setDob_m(int dob_m) {
		this.dob_m = dob_m;
	}

	public int getDob_y() {
		return dob_y;
	}

	public void setDob_y(int dob_y) {
		this.dob_y = dob_y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Person getBoss() {
		return boss;
	}

	public void setBoss(Person boss) {
		this.boss = boss;
	}

	public Person[] getWorker() {
		return worker;
	}

	public void setWorker(Person[] worker) {
		this.worker = worker;
	}

	public int getNworkers() {
		return nworkers;
	}

	public void setNworkers(int nworkers) {
		this.nworkers = nworkers;
	}
		
	
}

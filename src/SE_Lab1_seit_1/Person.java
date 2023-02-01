package SE_Lab1_seit_1;
import java.io.PrintStream;

public class Person {
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
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
		if (type == 1)	{
			ps.print(" bosses: ");
			for (int i = 0; i < nworkers; i++)
				ps.print(worker[i].name+" ");
		}
		else
			ps.print(" is bossed by "+boss.name);
	}

	public	String	name;
	public	int	dob_d, dob_m, dob_y;	// date of birth
	public	int	type;	// 1 = Boss, 2 = Worker
	public	Person	boss;
	public	Person[] worker;
	public	int	nworkers;
}

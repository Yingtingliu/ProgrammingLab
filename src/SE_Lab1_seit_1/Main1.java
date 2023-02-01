package SE_Lab1_seit_1;

public class Main1 {

	public static void main(String[] args)	{
		Person	w1 = new Person("aaa", 1, 2, 1991); w1.type = 2;
		Person	w2 = new Person("bbb", 3, 4, 1993); w2.type = 2;
		Person	w3 = new Person("ccc", 5, 6, 1995); w3.type = 2;
	
		Person	b1 = new Person("ddd", 7, 8, 1997); b1.type = 1;
		b1.worker = new Person[10];
		Person	b2 = new Person("eee", 9,10, 1999); b2.type = 1;
		b2.worker = new Person[10];
	
		w1.boss = b1; b1.worker[b1.nworkers++] = w1;
		w2.boss = b1; b1.worker[b1.nworkers++] = w2;
		w3.boss = b1; b1.worker[b1.nworkers++] = w3;
	
		b1.print(System.err); System.err.print("\n");
		b2.print(System.err); System.err.print("\n");
		w1.print(System.err); System.err.print("\n");
		w2.print(System.err); System.err.print("\n");
		w3.print(System.err); System.err.print("\n");
	}
	
}

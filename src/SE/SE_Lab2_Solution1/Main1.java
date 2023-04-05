package SE.SE_Lab2_Solution1;

public class Main1 {

	public static void main(String[] args)	{
		Worker	w1 = new Worker("aaa", new dob(1, 2, 1991)); 
		Worker	w2 = new Worker("bbb", new dob(3, 4, 1993)); 
		Worker	w3 = new Worker("ccc", new dob(5, 6, 1995)); 
	
		Boss	b1 = new Boss("ddd", new dob(7, 8, 1997)); 
		Boss	b2 = new Boss("eee", new dob(9,10, 1999)); 
	
		b1.addAndSetWorker(w1);
		b1.addAndSetWorker(w2);
		b1.addAndSetWorker(w3);
	
		b1.print(System.err); System.err.print("\n");
		b2.print(System.err); System.err.print("\n");
		w1.print(System.err); System.err.print("\n");
		w2.print(System.err); System.err.print("\n");
		w3.print(System.err); System.err.print("\n");
	}
	
}



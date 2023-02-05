package SE_Lab1_seit_1;

public class Main1 {

	public static void main(String[] args)	{

	
		Person	b1 = new Person("ddd", 7, 8, 1997,1); 
//		b1.setType(1);
//		b1.setWorker(new Person[10]); // routine coupling
		Person	b2 = new Person("eee", 9,10, 1999,1); 
//		b2.setType(1);
//		b2.setWorker(new Person[10]); // routine coupling
		
		Person	w1 = new Person("aaa", 1, 2, 1991,2,b1); 
//		w1.setType(2); // routine coupling
		Person	w2 = new Person("bbb", 3, 4, 1993,2,b1); 
//		w2.setType(2);
		Person	w3 = new Person("ccc", 5, 6, 1995,2,b1); 
//		w3.setType(2);		
		
	
		//set boss and worker
		int a = b1.getNworkers();
		
//		w1.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w1;
		    b1.setNworkers(a);
		}
		
//		w2.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w2;
		    b1.setNworkers(a);
		}
		
//		w3.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w3;
		    b1.setNworkers(a);
		}

		b1.print(System.err); System.err.print("\n");
		b2.print(System.err); System.err.print("\n");
		w1.print(System.err); System.err.print("\n");
		w2.print(System.err); System.err.print("\n");
		w3.print(System.err); System.err.print("\n");
	}
	
}

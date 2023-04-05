package SE.SE_Lab1_seit_1;

public class Main2 {

	public static void main(String[] args) {
		
		Person	w1 = new Person("aaa", 1, 2, 1991); 
		w1.setType(2);
		Person	w2 = new Person("bbb", 3, 4, 1993); 
		w2.setType(2);
		Person	w3 = new Person("ccc", 5, 6, 1995); 
		w3.setType(2);
	
		Person	b1 = new Person("ddd", 7, 8, 1997); 
		b1.setType(1);
		b1.setWorker(new Person[10]);
		Person	b2 = new Person("eee", 9,10, 1999); 
		b2.setType(1);
		b2.setWorker(new Person[10]);
	
		//set boss and worker
		int a = b1.getNworkers();
		
		w1.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w3;
		}
		
		w2.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w3;
		}
		
		w3.setBoss(b1);
		if (b1.getWorker()[a] == null) {
		    b1.getWorker()[a++] = w3;
		}

		b1.print(System.err); System.err.print("\n");
		b2.print(System.err); System.err.print("\n");
		w1.print(System.err); System.err.print("\n");
		w2.print(System.err); System.err.print("\n");
		w3.print(System.err); System.err.print("\n");

	}

}

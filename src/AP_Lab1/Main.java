package AP_Lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person m = new Employee("Alice", 100, "Finance");
		System.out.println(m.name);
		
		Employee s = new Employee("Mary", 200, "IT");
		System.out.println("----");
		System.out.println(s.name);
	}

}

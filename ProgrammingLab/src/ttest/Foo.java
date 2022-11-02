package ttest;

public class Foo {
	
	static void alpha() {
		/* more code here */
		System.out.println("alpha");
	}
	void beta() {
		/* more code here */ 
//		System.out.println("beta");
		alpha();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Foo.alpha();
		
		Foo foo = new Foo();
		foo.beta();
	}

}

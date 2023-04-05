package AP.AP_Lecture10;

public class TheApplication {

	void startSlowThing() {
		MyClass myObj = new MyClass();
		SlowRunnable r = new SlowRunnable(myObj);
		Thread t = new Thread(r);
		t.start();
	}

}

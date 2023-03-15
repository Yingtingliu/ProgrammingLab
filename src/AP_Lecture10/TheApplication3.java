package AP_Lecture10;

public class TheApplication3 {

	void startSlowThing() {
		MyClass myObj = new MyClass();
		class SlowRunnable implements Runnable {
//			MyClass thObj_;
//
//			SlowRunnable(MyClass theObj_) {
//				this.thObj_ = theObj_;
//			}

			public void run() {
				myObj.doSlowThing(); // change to my obj
			}
		}
		SlowRunnable r = new SlowRunnable(); // delete param
		Thread t = new Thread(r);
		t.start();
	}

}

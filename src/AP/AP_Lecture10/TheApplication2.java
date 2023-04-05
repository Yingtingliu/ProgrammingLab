package AP.AP_Lecture10;

public class TheApplication2 {

	void startSlowThing() {
		MyClass myObj = new MyClass();
		class SlowRunnable implements Runnable {
			MyClass thObj_;

			SlowRunnable(MyClass theObj_) {
				this.thObj_ = theObj_;
			}

			public void run() {
				thObj_.doSlowThing();
			}
		}
		SlowRunnable r = new SlowRunnable(myObj);
		Thread t = new Thread(r);
		t.start();
	}

}

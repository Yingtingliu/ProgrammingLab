package AP_Lecture10;

public class TheApplication4 {

	void startSlowThing() {
		MyClass myObj = new MyClass();
//		Runnable runnable = new Runnable {
//			MyClass thObj_;
//
//			SlowRunnable(MyClass theObj_) {
//				this.thObj_ = theObj_;
//			}
//
//			void run() {
//				myObj.doSlowThing();
//			}
//		};
		Runnable r = new Runnable() {
		    public void run() {
		        myObj.doSlowThing();
		    }
		};	

//		SlowRunnable r = new SlowRunnable(myObj);
		Thread t = new Thread(r);
		t.start();
	}

}

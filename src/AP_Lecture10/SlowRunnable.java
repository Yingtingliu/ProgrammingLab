package AP_Lecture10;

public class SlowRunnable implements Runnable{
	
	MyClass theObj;
	
	SlowRunnable(MyClass theObj) {
	 this.theObj = theObj;
	}

	@Override
	public void run() {
		theObj.doSlowThing();
		
	}

}

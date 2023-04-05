package AP.AP_Lecture10;

public class TheApplication5 {

	void startSlowThing() {
		var myObj = new MyClass();

		var r = new Runnable() {
		    public void run() {
		        myObj.doSlowThing();
		    }
		};	

		var t = new Thread(r);
		t.start();
	}

}

package AP.AP_Lecture10;

public class TheApplication6 {

	void startSlowThing() {
		var myObj = new MyClass();

//		var r = new Runnable() {
//		    public void run() {
//		        myObj.doSlowThing();
//		    }
//		};	
		
		// since this is a functional interface 
		// is one that declares exactly one methodv
		
		var t = new Thread(myObj::doSlowThing);
		t.start();
	}

}

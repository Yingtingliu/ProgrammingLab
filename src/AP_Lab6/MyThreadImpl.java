package AP_Lab6;

public class MyThreadImpl implements Runnable{
	
	String name;
	
	public MyThreadImpl() {
		//TODO Auto-generated constructor stub
	}
	
	public MyThreadImpl(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i =0;i<11;i++) {
			System.out.println(i);
			System.out.println(
		            "Current Thread Name: "
		            + Thread.currentThread().getName());
		        
		        // gets the ID of the current thread
		        System.out.println(
		            "Current Thread ID: "
		            + Thread.currentThread().getId());
		        Thread.yield(); // wait for word to finish   
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}

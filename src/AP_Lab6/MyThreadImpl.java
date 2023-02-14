package AP_Lab6;

public class MyThreadImpl implements Runnable{
	
	public MyThreadImpl() {
		//TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int i =0;i<11;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}

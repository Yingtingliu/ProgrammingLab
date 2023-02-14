package AP_Lab6;

public class MyTestMain {

	public static void main(String[] args) {
		MyThreadImpl mythread1 = new MyThreadImpl();
		Thread test1 = new Thread(mythread1);
		test1.start();		

	}

}

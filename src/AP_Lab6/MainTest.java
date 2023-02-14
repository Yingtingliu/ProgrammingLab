package AP_Lab6;

import org.junit.Test;

import AP_Lab1.test;

public class MainTest {
	
	@Test
	public void testThreadImpl() {
		MyThreadImpl mythread1 = new MyThreadImpl();
		Thread test1 = new Thread(mythread1);
		test1.start();		
	}

}

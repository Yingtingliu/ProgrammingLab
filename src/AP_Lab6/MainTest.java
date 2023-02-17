package AP_Lab6;

import org.junit.Test;

import AP_Lab1.test;

public class MainTest {
	
//	@Test
//	public void testThreadImpl() {
//		MyThreadImpl mythread1 = new MyThreadImpl();
//		Thread test1 = new Thread(mythread1);
//		test1.start();		
//	}
//	
//	@Test
//    public void testMultipleThreads() {
//		MyThreadImpl myRunnable1 = new MyThreadImpl();
//		MyThreadImpl myRunnable2 = new MyThreadImpl();
//		MyThreadImpl myRunnable3 = new MyThreadImpl();
//        Thread thread1 = new Thread(myRunnable1);
//        Thread thread2 = new Thread(myRunnable2);
//        Thread thread3 = new Thread(myRunnable3);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        try {
//            thread1.join(); // wait for threads to finish
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//	
//	
//	@Test
//    public void testMultipleThreads2() {
//		MyThreadImpl myRunnable1 = new MyThreadImpl("run1");
//		MyThreadImpl myRunnable2 = new MyThreadImpl("run2");
//		MyThreadImpl myRunnable3 = new MyThreadImpl("run3");
//        Thread thread1 = new Thread(myRunnable1,"run1");
//        Thread thread2 = new Thread(myRunnable2,"run2");
//        Thread thread3 = new Thread(myRunnable3,"run3");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        try {
//        	
//            thread1.join(); // wait for threads to finish            
//            thread2.join();            
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
	
	/*
	 * If you call Thread.yield() in the main method, 
	 * it will cause the main thread to yield the processor to other threads 
	 * if any are waiting to execute. 
	 * However, if there are no other threads waiting to execute, 
	 * the main thread will continue to execute.

	 * 	If you call Thread.yield() in a method that implements Runnable, 
	 * 	it will cause the current thread executing the run() method to yield the processor 
	 * 	to other threads if any are waiting to execute. 
	 * 	This may allow other threads to execute more frequently and improve overall system performance. 
	 * 
	 * */
	
	@Test
	public void testSequenceOfConcurrency() {
		MyThreadImpl myRunnable1 = new MyThreadImpl();
		MyThreadImpl myRunnable2 = new MyThreadImpl();
		MyThreadImpl myRunnable3 = new MyThreadImpl();
        Thread thread1 = new Thread(myRunnable1,"run1");
        Thread thread2 = new Thread(myRunnable2,"run2");
        Thread thread3 = new Thread(myRunnable3,"run3");
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.yield(); // wait for word to finish      
        System.out.println("start all");       
         
	}

}

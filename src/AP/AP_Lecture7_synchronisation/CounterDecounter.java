package AP.AP_Lecture7_synchronisation;
import java.util.concurrent.locks.*;
public class CounterDecounter {
	public static class MyCounter {
		// MyCounter now has increment and decrement methods each with locks
		// Now the locks are also in try blocks
		private int count = 0;
		private ReentrantLock counterLock = new ReentrantLock();
		public void increment(int amount) {
			counterLock.lock();
			try {
				count += amount;
				System.out.println("Adding " + amount + ", result " + count);
			} finally {
				counterLock.unlock();
			}
		}
		public void decrement(int amount) {
			counterLock.lock();
			try {
				count -= amount;
				System.out.println("Subtracting " + amount + ", result " + count);
			} finally {
				counterLock.unlock();
			}
		}
		public int getCount() {
			return count;
		}
	}
	public static class Counter extends Thread {
		private MyCounter count;
		private int n;
		private int amount;
		public Counter(MyCounter count,int n,int amount) {
			this.count = count;
			this.n = n;
			this.amount = amount;
		}
		public void run() {
			for(int i=0;i<n;i++) {
				count.increment(amount);
			}
		}
	}
	public static class DeCounter extends Thread {
		private MyCounter count;
		private int n;
		private int amount;
		public DeCounter(MyCounter count,int n,int amount) {
			this.count = count;
			this.n = n;
			this.amount = amount;
		}
		public void run() {
			for(int i=0;i<n;i++) {
				count.decrement(amount);
			}
		}
	}
	public static void main(String[] args) {
		MyCounter count = new MyCounter();
		// Create some counters and decounters
		// such that we will end up with zero
		int nCounters = 10,incNum = 10;
		int nDeCounters = 2,decNum = 50;
		int nReps = 10;

		Counter[] c = new Counter[nCounters];
		DeCounter[] d = new DeCounter[nDeCounters];
		
		// Create and start the counters and decounters
		for(int i=0;i<nDeCounters;i++) {
			d[i] = new DeCounter(count,nReps,decNum);
			d[i].start();
		}
		for(int i=0;i<nCounters;i++) {
			c[i] = new Counter(count,nReps,incNum);
			c[i].start();
		}
		

		// Wait for everything to finish
		try {
			for(int i=0;i<nCounters;i++) {
				c[i].join();
			}
			for(int i=0;i<nDeCounters;i++) {
				d[i].join();
			}
		}catch(InterruptedException e) {
			// Do nothing
		}
		System.out.println("Final Result: " + count.getCount());
	}
}
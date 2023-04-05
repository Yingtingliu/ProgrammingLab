package AP.AP_AE2;

public class TestInterrupt {

	public static void main(String[] args) {

		Thread.currentThread().interrupt(); // interrupt the current thread

		System.out.println(Thread.currentThread().isInterrupted()); // prints true
		System.out.println(Thread.currentThread().isInterrupted()); // prints true again

		System.out.println(Thread.interrupted()); // prints true and clears the interrupt flag
		System.out.println(Thread.currentThread().isInterrupted());
		// prints false
	}
}

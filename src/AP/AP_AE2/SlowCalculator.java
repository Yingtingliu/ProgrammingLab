package AP.AP_AE2;

public class SlowCalculator implements Runnable {

    private final long N;
    private int result;
    private boolean complete;

    public SlowCalculator(final long N) {
        this.N = N;
        this.result = 0;
        this.complete = false;
    }

    public void run() {
    	try {
            final int result = calculate(N);
            this.result = result; 
            this.complete = true;
        } catch (InterruptedException e) {            
            this.complete = false;
        }
    }  
    

    private static int calculate(final long N) throws InterruptedException {
        // This (very inefficiently) finds and returns the number of unique prime factors of |N|
        // You don't need to think about the mathematical details; what's important is that it does some slow calculation taking N as input
        // You should not modify the calculation performed by this class, but you may want to add support for interruption
        int count = 0;
        for (long candidate = 2; candidate < N; ++candidate) {
        	if (Thread.interrupted()) { // Check if interrupted, and set the flag
                throw new InterruptedException(); // Throw InterruptedException if interrupted
            }
            if (isPrime(candidate)) {
                if (Math.abs(N) % candidate == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrime(final long n) {
        // This (very inefficiently) checks whether n is prime
        // You should not modify this method
        for (long candidate = 2; candidate < Math.sqrt(n); ++candidate) {
            if (n % candidate == 0) {
                return false;
            }
        }
        return true;
    }

	public long getN() {
		return N;
	}
    
	public int getResult() {
    	return result;
    }
    
	public boolean isComplete() {
        return this.complete;
    }
}

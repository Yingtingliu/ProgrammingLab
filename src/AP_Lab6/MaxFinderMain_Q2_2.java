package AP_Lab6;

public class MaxFinderMain_Q2_2 {

	public static void main(String[] args) {
	    MaxFinder randArray = new MaxFinder();
	    Double[][] array = randArray.createArray();
	    int rows = randArray.getnRows();
	    int cols = randArray.getnCols();
	    Double[] maxValues = new Double[rows];

	    // Create a thread for each row of the 2D array
	    Thread[] threadArray = new Thread[rows];
	    for (int i = 0; i < rows; i++) {
	        Double[] row = array[i];
	        maxValues[i] = Double.MIN_VALUE; // Initialize to smallest possible value

	        // Create a MaxFinderThread instance for this row and start the thread
	        MaxFinderThread mfThread = new MaxFinderThread(row, maxValues, i);
	        Thread thread = new Thread(mfThread);
	        thread.start();
	        threadArray[i] = thread;
	    }

	    // Wait for all threads to finish
	    for (Thread thread : threadArray) {
	        try {
	            thread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    // Print the maximum value of each row
	    System.out.println("Maximum values:");
	    for (int i = 0; i < rows; i++) {
	        System.out.println("Row " + i + ": " + maxValues[i]);
	    }
	}	

}

package AP_Lab6;

public class MaxFinderMain_Q2_3 {
	
	public static void main(String[] args) {
	    MaxFinder randArray = new MaxFinder();        
	    Double[][] array = randArray.createArray();
	    int rows = randArray.getnRows();
	    int cols= randArray.getnCols();

	    // create result array
	    Double[] resultArray = new Double[cols];

	    // create threads
	    Thread[] threads = new Thread[rows];
	    MaxFinderThread[] mfThreads = new MaxFinderThread[rows];     
	    for (int i = 0; i < rows; i++) {
	        mfThreads[i] = new MaxFinderThread(array[i], resultArray, i);
	        threads[i] = new Thread(mfThreads[i]);
	        threads[i].start();
	    }

	    // wait for all threads to finish
	    for (Thread thread : threads) {
	        try {
	            thread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    // find final result
	    MaxFinderThread finalThread = new MaxFinderThread(resultArray, resultArray, 0);
	    Thread finalThreadObj = new Thread(finalThread);
	    finalThreadObj.start();
	    try {
	        finalThreadObj.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    Double finalResult = resultArray[0];

	    System.out.println("Final result: " + finalResult);
	}
	
}

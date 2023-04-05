package AP.AP_Lab6;

public class MaxFinderThread implements Runnable{
	
	Double[] oneDimArray;
	Double[] resultArray;
	int position;
	
	public MaxFinderThread(Double[] oneDimArray, Double[] resultArray, int position) {
		this.oneDimArray = oneDimArray;
		this.resultArray = resultArray;
		this.position = position;
	}
	
	public void findMax() {
	    Double max = null;
	    for(int i = 0; i < oneDimArray.length; i++) {
	        if (oneDimArray[i] != null && (max == null || oneDimArray[i] > max)) {
	            max = oneDimArray[i];
	            position = i;
	        }
	    }
	    this.resultArray[position] = max;
	}
	
	
	
	@Override
	public void run() {
		findMax();
//		resultArray[position] = oneDimArray[position];
	}

}

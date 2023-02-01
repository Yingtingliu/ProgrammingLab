package Week10;
public class BinarySequences {
	public static void binarySequence(String soFar, int n, int m) {
		/*
		 *  stopping criteria
		 */
		/*
		 * n and m are both zero, it's valid, print
		 */
		if(n==0 && m == 0) {
			System.out.println(soFar);
			return;
		}
		/*
		 * we need to add more 1s but we don't have 
		 * space
		 * Just return, without printing
		 */
		if(m > n) {
			return;
		}
		/*
		 * We have more chars, but don't need any more 1s
		 * Add a zero and call again
		 */
		if(n > 0 && m == 0) {
			binarySequence(soFar + "0",n-1,m);
		}else {
			/*
			 * we have more chars and one or more 1s
			 */
			binarySequence(soFar + "0",n-1,m);
			binarySequence(soFar + "1",n-1,m-1);
		}
	}
	
	public static void nonBinarySequence(String soFar, int n, int m, int maxVal) {
		// No more chars and we have reached m
		if(n==0 && m == 0) {
			System.out.println(soFar);
			return;
		}
		// no more chars and not reached m -- just return, not a valid sequence 
		if(n==0) {
			return;
		}
		/*
		 * Otherwise -- try adding each in turn
		 */
		for(int i=0;i<=maxVal;i++) {
			// if we can add an i character, do it
			if(i <= m) {
				nonBinarySequence(soFar + " " + i,n-1,m-i,maxVal);
			}
		}

	}
	
	public static void main(String[] args) {
		binarySequence("",4,2);
		System.out.println();
		nonBinarySequence("",3,3,2);
	}
}

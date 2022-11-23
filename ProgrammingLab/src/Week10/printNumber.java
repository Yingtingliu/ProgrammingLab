package Week10;

public class printNumber {
	
	private static int printNumber(int max) {
		if (max == 1)
			return 1;
		else
			return max + printNumber(max - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printNumber(3));

	}

}

package Week10;

public class Adding {
	public static int addUp(int[] array, int i, int j) {
		// Stopping criteria is if i == j
		if(i==j) {
			return array[i];
		}else {
			return array[i] + addUp(array,i+1,j);
		}
	}
	public static int addUp(int[] array) {
		return addUp(array,0,array.length-1);
	}
	public static void main(String[] args) {
		int[] a = {3,4,76,1,3,5,2};
		System.out.println(addUp(a));
	}
}

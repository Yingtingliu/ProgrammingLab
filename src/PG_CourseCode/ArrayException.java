package PG_CourseCode;

import java.util.Random;
public class ArrayException {
	public static void main(String[] args) {
		int[] x = new int[10];
		Random r = new Random();
		int pos = r.nextInt(20);
		System.out.println(x[pos]);
	}
}

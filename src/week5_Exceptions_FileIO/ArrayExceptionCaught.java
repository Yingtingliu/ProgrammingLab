package week5_Exceptions_FileIO;

import java.util.Random;
public class ArrayExceptionCaught {
	public static void main(String[] args) {
		int[] x = new int[10];
		Random r = new Random();
		try {
			int pos = r.nextInt(20);
			System.out.println(x[pos]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Too big");
		}finally {
			System.out.println("This happens whatever");
		}
	}
}

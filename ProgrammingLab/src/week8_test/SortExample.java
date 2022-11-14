package week8_test;

import java.util.Random;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number[] a = new Number[10];
		Random r = new Random();
		System.out.println("Unsorted");
		for (int i = 0; i < 10; i++) {
			a[i] = new Number(r.nextInt(100));
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Sorted");
		Sorting.sort(a);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Car[] b = new Car[5];
		System.out.println("Unsorted");
		for (int i = 0; i < 5; i++) {
			b[i] = new Car(r.nextDouble() * 200.0);
			System.out.println(b[i]);
		}
		System.out.println("Sorted");
		Sorting.sort(b);
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}
	}

}

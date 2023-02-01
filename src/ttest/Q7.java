package ttest;

public class Q7 { //Question 2 for quiz1
	private int value;

	public Q7(int a) {
		value = a;
	}

	public void increment() {
		value += 1;
	}

	public int getNumber() {
		return value;
	}

	public static void main(String[] args) {
		Q7 a = new Q7(4);
		Q7 b = a;
		a.increment();
		b.increment();
		b = null;
		System.out.println(a.getNumber());
	}
}

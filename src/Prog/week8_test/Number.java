package Prog.week8_test;

public class Number implements Orderable {
	private int n;

	public Number(int n) {
		this.n = n;
	}

	public String toString() {
		return "" + this.n;
	}

	public int getN() {
		return this.n;
	}

	public boolean isBiggerThan(Orderable other) {
		if (this.n > ((Number) other).getN()) {
			return true;
		} else {
			return false;
		}
	}

}

package Prog.week8_test;

public class Car implements Orderable {
	private double maxSpeed;

	public Car(double m) {
		this.maxSpeed = m;
	}

	public String toString() {
		return "Max speed is " + this.maxSpeed;
	}

	public double getSpeed() {
		return this.maxSpeed;
	}

	public boolean isBiggerThan(Orderable other) {
		Car otherCar = (Car) other;
		if (this.maxSpeed > otherCar.getSpeed()) {
			return true;
		} else {
			return false;
		}
	}
}

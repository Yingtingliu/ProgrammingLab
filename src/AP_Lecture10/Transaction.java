package AP_Lecture10;

public class Transaction {

	int value;
	String currency;
	int year;

	Transaction(String currency, int value, int year) {
		this.value = value;
		this.currency = currency;
		this.year = year;
	}

	int getValue() {
		return value;
	}

	String getCurrency() {
		return currency;
	}

	int getYear() {
		return year;
	}

	public String toString() {
		return currency + ":" + value + ":" + year;
	}

}

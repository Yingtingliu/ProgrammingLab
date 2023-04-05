package AP.AP_Lecture10;

import java.util.Arrays;
import java.util.Comparator;

public class TestCat {

	public static void main(String[] args) {
//		var c = new Cat();
//		var t = new Thread(c::eat); // fail

//		var t = new Thread(() -> c.eat("fish"));

		var cats = Arrays.asList(
				new Cat("Ginger", 4.5), 
				new Cat("skinny", 3.2), 
				new Cat("Blinky", 3.9));

		// without lambda expression:
		cats.sort(new Comparator<Cat>() {
			public int compare(Cat c1, Cat c2) {
				var firstUpperCase = c1.name.toUpperCase();
				var secondUpperCase = c2.name.toUpperCase();
				return firstUpperCase.compareTo(secondUpperCase);
			}
		});

		cats.sort((c1, c2) -> {
			var firstUpperCase = c1.name.toUpperCase();
			var secondUpperCase = c2.name.toUpperCase();
			return firstUpperCase.compareTo(secondUpperCase);
		});

	}

}

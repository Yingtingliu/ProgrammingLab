package AP.AP_Lecture10;

import java.util.Arrays;

public class TestTransaction {

	public static void main(String[] args) {
		
		Transaction[] tList = { 
				new Transaction("pound", 2000, 2021), 
				new Transaction("euro", 1000, 2017),
				new Transaction("usd", 2500, 2020), 
				new Transaction("pound", 200, 2018),
				new Transaction("euro", 100, 2019), 
				new Transaction("usd", 500, 2021),
				new Transaction("pound", 1500, 2021) };
		}
	
//		Arrays.asList(1, 3, 5).stream().map((n) -> n * 2)	

}

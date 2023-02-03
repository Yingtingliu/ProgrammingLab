package PG_CourseCode.FileIO;

import java.util.Random;
public class Delegation {
	public static void main(String[] args) {
		try {
			myMethod();
		}catch(MyException e) {
			e.printStackTrace();
		}
	}
	public static void myMethod() throws MyException {
		// some code
		if(new Random().nextInt(10)<=7) {
			throw new MyException();
		}
	}
}

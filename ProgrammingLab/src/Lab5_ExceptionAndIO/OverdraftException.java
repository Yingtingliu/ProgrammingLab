package Lab5_ExceptionAndIO;

import java.io.PrintStream;

public class OverdraftException extends java.lang.Exception {
	
	public void printStackTrace() {
        overdraftException(System.err);
    }

	private void overdraftException(PrintStream err) {
		// TODO Auto-generated method stub
		System.err.println("withdraw exceed the balance, transaction cancelled!");
	}
	
}

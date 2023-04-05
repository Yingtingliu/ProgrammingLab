package Prog.Week10;

/*
 *  Fibonacci number. The nth Fibonacci number F(n) is defined as:
	F(n) = F(n-1) + F(n-2)
	The first two numbers are defined as: F(0) = 0 and F(1) = 1.
	Therefore:
	F(2) = F(1) + F(0) = 1,
	F(3) = F(2) + F(1) = 2,
	F(4) = F(3) + F(2) = 3,
	F(5) = 2 + 3 = 5,
	F(6) = 3 + 5 = 8,
	etc
	Write a method that uses recursion to compute the Nth Fibonacci number (N >= 0). For
	testing purposes, F(12) = 144.
 * 
 */

public class week10lab_Q2 {
	
	public static int fib(int n) {
//		int i = 0;
		if(n==0) return 0;
		if(n==1||n==2) return 1;
		
			return fib(n-2)+fib(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber = 10;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fib(i) +" ");		
		}

	}

}

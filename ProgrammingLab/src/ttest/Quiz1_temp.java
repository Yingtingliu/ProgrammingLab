package ttest;

public class Quiz1_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Quiz1_Q3
//		What will be the contents of a at the end of this code? Drag the numbers into the correct order.

//		int[] a = { 3, 5, 2, 1 };
//		int temp = a[2];
//		a[2] = a[1];
//		int temp2 = a[3];
//		a[3] = temp;
//		a[1] = temp2;
//		for (int x : a) {
//			System.out.println(x); // 3152
//		}

//		Question 4
//		Will this code run? (only answer 'yes' or 'no')

//		int[] integerArray = new int[5];
//		for (int i = integerArray.length; i > 0; i--) {
//			integerArray[i] = i * 2;
//			System.out.println(integerArray[0]);
//		}
//		Answer: no

//		Question 5
//		One of the lines in this code includes a syntax error. Which is it?
//		
//		int a1 = 2;  //duplicate, change to a1
//		int x = a1 * 4;
//		int y = 20; 
//		{
//			System.out.println(x \ 2); //this line is wrong
//		}

//		Question 6
//		What is the result of the following?
//		
		System.out.println((2 / 3) + (9 / 5) + 8 * (2 + 2));
//		
//		Answer: 33
//		P Flag question
//		Question 7 Complete
//		What is the result of the following in Java:
		System.out.println(9 / (2.0 * 1));// 4.5

//		Question 8 Complete
//		Marked out of 1.00
//		What will be the value of b after this code? public static void main(String[] args) {
//		int a = 6; int b = a; int c = b; int d = c; a++; System.out.println(c+d);
//		Answer: 12

//		Question 9
//		Complete
//		Will this code run? public class Q11 {public static void main(String[] args) {System.out.println(Hello world);}}
//		I a. No

//		Question 10
		for (int i = 2; i < 15; i *= 2) {
			for (int j = 2; j < i - 2; j++) {
				System.out.print(i);
			}
			System.out.print(i - 1);
		}
		System.out.println("");

		System.out.println("---Q11----");

		int d = 1;
		int e = method1(d);
		System.out.println(e);

	}

	public static int method1(int a) {
//		System.out.println(2 / 3 + 1);
//		System.out.println(method2(a)); //remainer is 0
		return method2(a) * (2 / 3 + 1);
	}

	public static int method2(int a) {
		return a %= a;
	}
}

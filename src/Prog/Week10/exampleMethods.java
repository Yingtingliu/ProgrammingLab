/**
 * This class contains implementations of all the algorithms 
 * discussed in the lectures in week 9 along with some small additional
 * examples.
 *
 * There is also some testing in main method
 * remove comments/edit to test other methods
 */
package Prog.Week10;

import java.util.ArrayList;

public class exampleMethods {
	
	/*
	 * simple power method
	 */
	public static int power1(int b, int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p = p * b;
		}
		return p;
	}

	/*
	 * alternative power method
	 */
	public static int power2(int b, int n) {
		int p = 1;
		int q = b;
		int m = n;
		while (m > 0) {
			if ((m % 2) == 1)
				p = p * q;
			m = m / 2;
			q = q * q;
		}
		return p;

	}

	/*
	 * return the nth triangle number
	 */
	public static int triangle(int n) {
		int p = 0;
		for (int i = 1; i <= n; i++)
			p += i;
		return p;
	}

	/*
	 * recursive method to return the nth triangle number I'm assuming no number
	 * < 1 is input
	 */
	public static int triangle2(int n) {
		if (n == 1)
			return 1;
		return n + triangle2(n - 1);
	}

	/*
	 * calculates factorial of n
	 */
	public static int factorial(int n) {
		int prod = 1;
		for (int i = 2; i <= n; i++)
			prod = prod * i;
		return prod;
	}

	/*
	 * recursively calculates factorial of n
	 */
	public static int factorial2(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial2(n - 1);
	}

	public static boolean allDifferent(int... args) {
		for (int i = 0; i < args.length - 1; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (args[i] == args[j])
					return false;
			}
		}
		return true;
	}

	/*
	 * calculate all permutations of a string of length 3, non-recursive
	 */
	public static ArrayList<String> permutations3(String s) {
		ArrayList<String> resultsList = new ArrayList<String>();
		for (int i1 = 0; i1 < 3; i1++) {
			for (int i2 = 0; i2 < 3; i2++) {
				for (int i3 = 0; i3 < 3; i3++) {
					if (allDifferent(i1, i2, i3))
						resultsList.add(s.charAt(i1) + "" + s.charAt(i2) + ""
								+ s.charAt(i3));
				}
			}
		}

		return resultsList;
	}

	/*
	 * calculate all permutations of a string of length 4, non-recursive
	 */
	public static ArrayList<String> permutations4(String s) {
		ArrayList<String> resultsList = new ArrayList<String>();
		for (int i1 = 0; i1 < 4; i1++) {
			for (int i2 = 0; i2 < 4; i2++) {
				for (int i3 = 0; i3 < 4; i3++) {
					for (int i4 = 0; i4 < 4; i4++) {
						if (allDifferent(i1, i2, i3, i4))
							resultsList.add(s.charAt(i1) + "" + s.charAt(i2)
									+ "" + s.charAt(i3) + "" + s.charAt(i4));
					}
				}
			}
		}
		return resultsList;
	}

	/*
	 * calculate all permutations of a string of length 5 non-recursive
	 */
	/*
	 * calculate all permutations of 1..5 non-recursive
	 */
	public static ArrayList<String> permutations5(String s) {
		ArrayList<String> resultsList = new ArrayList<String>();
		for (int i1 = 0; i1 < 5; i1++) {
			for (int i2 = 0; i2 < 5; i2++) {
				for (int i3 = 0; i3 < 5; i3++) {
					for (int i4 = 0; i4 < 5; i4++) {
						for (int i5 = 0; i5 < 5; i5++) {
							if (allDifferent(i1, i2, i3, i4, i5))
								resultsList.add(s.charAt(i1) + ""
										+ s.charAt(i2) + "" + s.charAt(i3) + ""
										+ s.charAt(i4) + "" + s.charAt(i5));
						}
					}
				}
			}
		}
		return resultsList;
	}

	public static ArrayList<String> permutations(String s) {
		ArrayList<String> resultsList = new ArrayList<String>();
		if(s.length()==1) resultsList.add(s);		
		for (int i = 0; i < s.length(); i++) {
			String shortString;
			String tempWord;
			shortString = s.substring(0,i) + s.substring(i+1,s.length());
//			System.out.println("1"+s.substring(0,i));
//			System.out.println("2"+s.substring(i+1,s.length()));
			ArrayList<String> shortResultsList = permutations(shortString);
//			System.out.println("3"+shortResultsList);
			for (String tempString : shortResultsList) {
				tempWord = s.charAt(i) + tempString;
				resultsList.add(tempWord);
//				System.out.println("4"+tempWord);
			}
		}

		return resultsList;
	}
	
	public static int linearSearch(String[] stringArray, String val, int start, int end){
		int i=start;
		while(i<=end){
			if(stringArray[i].equals(val)) return i; //found it
			if(stringArray[i].compareTo(val)>0) return -1; //gone past it
			i++; //continue searching
		}
		return -1; //it wasn't there
	}
	
	public static int binarySearch(String[] stringArray, String val, int start, int end){
		int i;
		    if(start<=end){
			   i=(start+end)/2;
			   System.out.println("and i is " + i);
			   if(stringArray[i].equals(val)) return i;
			   
			   else{
				   if(stringArray[i].compareTo(val)<0) {

					   return binarySearch(stringArray, val,i+1,end);
				   }
				   
				   else return binarySearch(stringArray,val,start,i-1);
			   }
		    }
		    return -1;
	}

	public static void main(String[] args) {
//		System.out.println("" + power1(2, 10));
//		System.out.println("" + power2(2, 10));
//		int n = 3;
//		System.out.println("The " + n + "th " + " triangle number is "
//				+ triangle2(n));
//		n = 6;
//		System.out.println("The " + n + "th " + " triangle number is "
//				+ triangle2(n));
//		n = 4;
//		System.out.println("" + n + " factorial is " + factorial2(n));
//		n = 10;
//		System.out.println("" + n + " factorial is " + factorial2(n));

		//System.out.println(permutations4("bark"));
		//System.out.println(permutations5("pinky"));
		//System.out.println(permutations3("bar"));
		
//		System.out.println(permutations("abc"));
		//permutations("abcdefghijklmno");
		//System.out.println("Program finished");
		String[] myStringArray = {"aardvark", "badger", "bat", "cat", "dog", "elephant", "fox", "monkey"};
		int pos = binarySearch(myStringArray, "dog", 0, 7);
		if(pos==-1) System.out.println("Dog not found");
		else System.out.println("Dog found at position " + pos);
		pos = binarySearch(myStringArray, "fish", 0, 7);
//		if(pos==-1) System.out.println("Fish not found");
//		else System.out.println("Fish found at position " + pos);
		
		
	}

}

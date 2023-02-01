package Week10;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *  Binary sequences. Lets define a binary sequence as a sequence of ints that contains only
	the values 0 or 1. Write a recursive method that will print all of the binary sequences of
	length n that contain m 1s. E.g. if n = 4 and m = 2 it will be all sequences that include 2 1s
	and 2 zeros:
	1100
	1010
	1001
	0110
	0101
	0011
	You don’t need to return the sequence in an array (although you can if you want), just print
	it out.
 * 
 */

public class week10lab_Q3 {
	
	public static void binarySeq(int arr[], int length, int one, int i) {
		
		if(length ==i && one ==0) {
			printTheArray(arr, length);
	        return;
		} 

		if(one>=1 && i<length) {
			
			arr[i] = 0;
			binarySeq(arr, length, one, i+1);	
//			System.out.println(Arrays.toString(arr));
			
			arr[i] = 1;
			binarySeq(arr, length, one-1, i+1);
//			System.out.println(Arrays.toString(arr));
		}
		else if(i<length) {
			arr[i] = 0;
			binarySeq(arr, length, one, i+1);	
//			System.out.println(Arrays.toString(arr));
			
		}
		
				
	}
	
	
	// Generate all the binary strings of N bits
	// https://www.geeksforgeeks.org/generate-all-the-binary-strings-of-n-bits/
	static void printTheArray(int arr[], int n)
	{
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
	 
	// Function to generate all binary strings
	static void generateAllBinaryStrings(int n,
	                            int arr[], int i)
	{
	    if (i == n)
	    {
	        printTheArray(arr, n);
	        return;
	    }

	    // First assign "0" at ith position
	    // and try for all other permutations
	    // for remaining positions
//	    System.out.println("i="+i+", n="+n +", [i]="+arr[i]);
	    arr[i] = 0;
	    generateAllBinaryStrings(n, arr, i + 1);
 
	    // And then assign "1" at ith position
	    // and try for all other permutations
	    // for remaining positions
//	    System.out.println("i="+i+", n="+n +", [i]="+arr[i]);
	    arr[i] = 1;
	    generateAllBinaryStrings(n, arr, i + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;		 
	    int[] arr = new int[n];
	    int one = 2;
	 
	    // Print all binary strings
//	    generateAllBinaryStrings(n, arr, 0);
	    binarySeq(arr, n, one, 0);

	}

}

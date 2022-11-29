package Week10;

import java.util.ArrayList;

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
	
	public static ArrayList<String> binarySeq(int length, int one) {
		
		ArrayList<String> resultsList = new ArrayList<String>();
		if(one==0) {
			for(int i=0;i<length;i++) {
				resultsList.add("0");
			}			
			return resultsList;
			
		} else {
			for(int j=0;j<length;j++) {
				resultsList.add("0");
				resultsList.add("1");	
				one--;
				length--;
			}
			
			return binarySeq(length,one);
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

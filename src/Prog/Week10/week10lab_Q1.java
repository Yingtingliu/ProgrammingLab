package Prog.Week10;

import java.util.ArrayList;

public class week10lab_Q1 {
	
	public static int addUp(int[] list, int start, int end, int sum) {
		
		int i=start;
		
		if(i<=end){
			sum+=list[i];
			i++; //continue searching
			start = i;
			return addUp(list,start,end,sum);			
		}
		else {
			return sum;
		}		
	}
	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	 }
	
	public static int sum2(int start, int end) {
	    if (end > start) {
	      return end + sum2(start, end - 1);
	    } else {
	      return end;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = addUp(new int[] {4,5,6,7,8},0,2,0);
		System.out.println(result);

	}

}

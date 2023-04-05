package Prog.Lab4_Array;

import java.util.Random;

public class primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1
		double[] array1 = new double[100];
		
		for (int i=0; i<100; i++) {
			
			Random r = new Random();
			double d = r.nextDouble();
			double k;
			if(d>0.5) {
				k = 1;
			}else {
				k= 0;
			}
			array1[i] = k;
			System.out.printf("%.0f ",array1[i]);    
		}		
		
	}
	
	//Question 2
	public static double average(double[] a) {
	    
		double sum = 0; 
	    double average = 0;
	    int i;
	    
		for (i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		average = sum/(i-1);
	    return average;
	}
	
	//Question 3
	public static int findFirstOccurence(int[] array, int number) {
		int flag = 0;
		int i;
		for(i =0; i<array.length; i++) {
			if(array[i]==number) {
				flag = 1;
				break;
			}
		}

		if(flag== 0) {
			return -1;
		} else {
			return i;
		}		
	}
	
	//Question 4
	public static int findLastOccurence(int[] array, int number) {
		int flag = 0;
		int i;
		for(i =array.length; i>=0 && i<=array.length; i--) {
			if(array[i]==number) {
				flag = 1;
				break;
			}
		}

		if(flag== 0) {
			return -1;
		} else {
			return i;
		}		
	}
	
	// Question 5
	public static int findAllOccurence(int[] array, int number) {
		int[] temp = new int[number];
		for (int x : temp) { 
            x = -1;
        }
		int j = 0;
		for(int i =0; i<array.length; i++) {
			if(array[i]==number) {			
				temp[j] = i;
				j++;
			}
		}
		return number;		
	}

}

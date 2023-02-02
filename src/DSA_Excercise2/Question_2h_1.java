package DSA_Excercise2;

//2A, 2B, 2E, 2H

public class Question_2h_1 {
	public int fractorialCal(int n) {
		
		
		if (n==0) {
			return 1;
		} else {			
			return n*fractorialCal(n-1);
		}
		
	}

}

package DSA.DSA_Excercise2;

//2A, 2B, 2E, 2H

public class Question_2h_2 {
	public int fractorialCal(int n) {
		int result = 1;
		for(int i =0; i<=n; i--) {
			n = result *n;
		}
		return result;
		
	}

}

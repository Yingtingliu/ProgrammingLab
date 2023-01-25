package DSA_Excercise1;

public class Question_1b {
	
	public int countGcd(int m, int n) {
		int p= m;
		int q = n;
		int count = 0;
		
		if(p==q && count ==0) {
			return q;
		}
		if(p==q && count !=0) {
			return (int) (p*Math.pow(2, count));
		}
		
		return q;
	}

}

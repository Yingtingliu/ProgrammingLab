package DSA.DSA_Excercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * 1A Use Euclid’s GCD algorithm to find the GCDs of the following pairs of
	numbers: 6 and 9; 12 and 18; 15 and 21; 11 and 15.
	
	 Euclid’s algorithm:
	1. Set p to m, and set q to n.
	2. While q does not exactly divide p, repeat:
	 	2.1. Set p to q, and set q to (p modulo q).
	3. Terminate yielding q
 */
public class Question_1a {

	
	public  int getGcd(int m, int n) {
		int p = m;
		int q = n;
		while(p%q!=0) {
			int r = p%q;
			p= q;
			q= r;			
		}		
		return q;
	}
//	
//	@Test
//	public void test() {
//		Question_1a a = new Question_1a();
//		int result1 = a.getGcd(270, 192);
//		assertEquals(result1, 6);
//	}

}

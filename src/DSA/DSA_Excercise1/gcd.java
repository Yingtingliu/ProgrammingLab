package DSA.DSA_Excercise1;

public class gcd {
	
	static int gcd (int m, int n) {
		// Return the greatest common divisor of m and n
		// (assumed positive).
		int p = m, q = n;
		while (p % q != 0) {
			int r = p % q;
			p = q;  q = r;
			}
		return q;
		}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // print some gcds
		
		int m = 15, n = 21, r = 7, s=9, t = 105;
		System.out.println("gcd of " + m + " and " + n + " is " + gcd(m,n));
		System.out.println("gcd of " + m + " and " + r + " is " + gcd(m,r));
		System.out.println("gcd of " + m + " and " + s + " is " + gcd(m,s));
		System.out.println("gcd of " + m + " and " + t + " is " + gcd(m,t));
		System.out.println("gcd of " + n + " and " + r + " is " + gcd(n,r));
		System.out.println("gcd of " + n + " and " + s + " is " + gcd(n,s));
		System.out.println("gcd of " + n + " and " + t + " is " + gcd(n,t));
		System.out.println("gcd of " + r + " and " + s + " is " + gcd(r,s));
		System.out.println("gcd of " + r + " and " + t + " is " + gcd(r,t));
		System.out.println("gcd of " + s + " and " + t + " is " + gcd(s,t));

	}

}

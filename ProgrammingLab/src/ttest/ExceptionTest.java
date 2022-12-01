package ttest;

public class ExceptionTest {
	
	public static void m1() throws Exception{
		m2();
	}

	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		m3();
	}

	private static Exception m3() {
		// TODO Auto-generated method stub
		return new Exception();
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			try {
				m1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

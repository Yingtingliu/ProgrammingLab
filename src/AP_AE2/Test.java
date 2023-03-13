package AP_AE2;

//import static org.junit.Assert.assertTrue;

public class Test {

	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.runCommand("finish 123"));
		
		//test case from the group	 
		
		System.out.println(solution.runCommand("start 191981000"));
		System.out.println(solution.runCommand("start 191981001"));
		System.out.println(solution.runCommand("start 191981002"));
		System.out.println(solution.runCommand("running"));
		System.out.println(solution.runCommand("cancel 191981000"));
		System.out.println(solution.runCommand("running"));
		System.out.println(solution.runCommand("abort"));
		System.out.println(solution.runCommand("running"));
		System.out.println(solution.runCommand("get 191981001"));

		System.out.println(solution.runCommand("start 1145202"));
		System.out.println(solution.runCommand("start 1145206"));
		System.out.println(solution.runCommand("running"));
		System.out.println(solution.runCommand("cancel 1145206"));
		System.out.println(solution.runCommand("running"));
		System.out.println(solution.runCommand("finish"));
		System.out.println(solution.runCommand("get 1145202"));
		System.out.println(solution.runCommand("get 1145206"));
	}

}

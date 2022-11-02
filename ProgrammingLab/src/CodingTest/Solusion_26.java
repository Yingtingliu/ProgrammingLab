package CodingTest;

public class Solusion_26 {

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[j]) {
				count++;
				nums[count] = nums[j];
			}
			j++;
		}
				
		return count + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 1, 2, 2, 3 };
		removeDuplicates(test);
	}

}

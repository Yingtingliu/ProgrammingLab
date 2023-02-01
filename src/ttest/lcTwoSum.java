package ttest;

import java.util.HashMap;
import java.util.Map;

public class lcTwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);              
        }
        throw new IllegalArgumentException("No Answer");            
    }
	
	public static void main(String[] args) {
		int[] test ={ 0, 1, 2, 6, 24, 120, 720, 5040 };		
		twoSum(test, 8);
		
	}

}

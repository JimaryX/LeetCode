package leet_code02;

import java.util.Arrays;

public class ThreeSumClose {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5};
		int target = 12;
		System.out.println(threeSumClosest(nums, target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3)
			return 0;
		int result = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (Math.abs(result - target) > Math.abs(sum - target)) {
					result = sum;
				}
				if (sum < target) {
					l++;
				} else if (sum > target) {
					r--;
				} else {
					return result;
				}
			}
		}
		return result;
	}
}

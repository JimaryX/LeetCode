package leet_code02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNumber {
	public static void main(String[] args) {
		int[] num = { -2, 0, 0, 2, 2 }; // [-2,0,0,2,2]
		System.out.println(threeSum(num));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3)
			return new ArrayList();

		List<List<Integer>> result = new ArrayList();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0)
				break;
			int l = i + 1, r = nums.length - 1;
			while (l < r) {

				int sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[l], nums[r]));
					while (nums[l] == nums[l + 1] && l < r)
						l++;
					while (nums[r] == nums[r - 1] && l < r)
						r--;
					l++;
					r--;
				} else if (sum > 0) {
					r--;
				} else {
					l++;
				}
			}
		}
		return result;
	}
}

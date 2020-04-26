package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Question03 {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 4, 3, 2 };
		System.out.println(findRepeatNumber(nums));
	}

	/**
	 * Set 集合中add()方法，如果集合中没有此值则add成功，返回true，
	 * 		若有此值，则add失败，返回false
	 * @param nums
	 * @return
	 */
	public static int findRepeatNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int repeat = -1;
		for (int num : nums) {
			if (!set.add(num)) {
				repeat = num;
				break;
			}
		}
		return repeat;
	}
}

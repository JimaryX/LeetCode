package leet_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1 两数之和 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例: 给定 nums = [2, 7, 11, 15], target = 9 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * @author erkxia
 *
 */

public class TwoNumsSum {
	public static void main(String[] args) {
		int[] test = { 3, 3, 3, 4, 6 };
		int target = 9;
		int[] result = twoSum3(test, target);
		System.out.println(result[0] + "--" + result[1]);
	}

	// 原始暴力法
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	// hashmap 两遍
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			/**
			 * hashmap 的key只能唯一，不会出现重复的key. 所以当有3个相同的值的数组会出现问题
			 * 但是由于题目只有一个解，所以不会存在3个相同的值：除非3个相同的值不是答案
			 */
			hashmap.put(nums[i], i);
		}
		System.out.println(hashmap.size());
		for (int i = 0; i < nums.length; i++) {
			int result = target - nums[i];
			if (hashmap.containsKey(result) && hashmap.get(result) != i) {
				return new int[] { i, hashmap.get(target - nums[i]) };
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	// 一遍hashmap
	public static int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int result = target - nums[i];
			if (hashmap.containsKey(result)) {
				return new int[] { hashmap.get(result), i };
			}
			hashmap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}

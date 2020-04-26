package template;

import java.util.Arrays;

public class ArraysMethod {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5}; 
		int[] nums2 = {6, 7, 8, 9, 10};
		System.arraycopy(nums, 1, nums2, 1, nums2.length - 1);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = Arrays.copyOf(nums, 10);
		System.out.println(Arrays.toString(nums3));
	}
}

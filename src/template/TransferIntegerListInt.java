package template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransferIntegerListInt {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		// List to int[]
		int[] nums = list1.stream().mapToInt(Integer::valueOf).toArray();
		
		// int[] to List
		int[] nums2 = { 9, 8, 7 };
		List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		
		// List to Integer[]
		Integer[] intObj3 = list2.toArray(new Integer[0]);
				
		// Integer[] to ArrayList
		Integer[] intObj4 = { 1, 2, 3 };
		List list4 = Arrays.asList(intObj4);

		// int[] to Integer[]
		int[] nums5 = { 1, 2, 3, 4, 5 };
		Integer[] intObj5 = Arrays.stream(nums5).boxed().toArray(Integer[]::new);

		// Integer[] to int[]
		int[] nums6 = Arrays.stream(intObj4).mapToInt(Integer::valueOf).toArray();
	}
}

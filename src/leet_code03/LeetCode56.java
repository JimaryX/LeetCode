package leet_code03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode56 {
	public static void main(String[] args) {
		int[][] intervals = { { 1, 4 }, { 2, 3 } };
		System.out.println(Arrays.deepToString(merge(intervals)));
	}

	public static int[][] merge(int[][] intervals) {
		if (intervals.length == 0) {
			return new int[][] {};
		}
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<int[]> list = new ArrayList<>();
		int[] num = intervals[0];
		for (int i = 1; i < intervals.length; i++) {
			if (num[1] >= intervals[i][0] && num[1] <= intervals[i][1]) {
				num[1] = intervals[i][1];
			} else if(num[1] > intervals[i][1]){
				continue;
			}else{
				list.add(num);
				num = intervals[i];
			}
		}
		list.add(num);

		return list.toArray(new int[0][]);
	}
}

package leet_code03;

public class LeetCode53 {
	public static void main(String[] args) {
		int[] nums = {-1, 2, -3, 4, 6, -2};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		/**
		 * 贪心算法：比较遍历的数与当前值加上遍历的数大小，如果遍历的数大，当前值就改为遍历的数，若果
		 * 		  当前值加上遍历的数大，那就加上遍历的数为当前值。然后再与当前最大值作比较。
		 */
		int sum, curren;
		sum = nums[0];
		curren = nums[0];
		for (int i = 1; i < nums.length; i++) {
			curren = Math.max(curren + nums[i], nums[i]);
			sum = Math.max(sum, curren);
		}
		return sum;
		
		/**
		 * 动态规划：
		 */
		/**
		int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
		*/
	}
}

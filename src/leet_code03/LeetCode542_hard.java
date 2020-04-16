package leet_code03;

import java.util.Arrays;

/**
 * 题目:给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。 两个相邻元素间的距离为 1 。 示例 : 输入: 0 0 0 0 1 0 1
 * 1 1 输出: 0 0 0 0 1 0 1 2 1
 * 
 * 解决思路:从左上方遍历每一个元素与其上方和左方最近的距离，再从右下方遍历每一个元素与其下方和右方最近的距离。
 * 
 * @author erkxia
 *
 */
public class LeetCode542_hard {
	public static void main(String[] args) {
		int[][] num = { { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 0 } };
		int[][] res = matrix(num);
		System.out.println(Arrays.deepToString(res));
	}

	public static int[][] matrix(int[][] num) {
		int[][] dp = new int[num.length][num[0].length];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j] == 0) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = 10000;
				}
			}
		}

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if (i - 1 >= 0) {
					dp[i][j] = Math.min(dp[i - 1][j] + 1, dp[i][j]);
				}
				if (j - 1 >= 0) {
					dp[i][j] = Math.min(dp[i][j - 1] + 1, dp[i][j]);
				}
			}
		}

		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp.length - 1; j >= 0; j--) {
				if (i + 1 <= dp.length - 1) {
					dp[i][j] = Math.min(dp[i + 1][j] + 1, dp[i][j]);
				}
				if (j + 1 <= dp.length - 1) {
					dp[i][j] = Math.min(dp[i][j + 1] + 1, dp[i][j]);
				}
			}
		}

		return dp;
	}

}

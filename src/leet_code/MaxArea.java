package leet_code;

public class MaxArea {
	public static void main(String[] args) {
		int[] height = {0};
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int result = 0, i = 0, j = height.length - 1;
		while (i != j) {
			if (height[i] > height[j]) {
				result = Math.max(result, (j - i) * height[j]);
				j--;
			} else {
				result = Math.max(result, (j - i) * height[i]);
				i++;
			}
		}

		return result;
	}
}

package interview;

public class Question11 {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 0, 1 };
		System.out.println(minArray(nums));
	}

	public static int minArray(int[] numbers) {
		int j = numbers.length - 1;
		if (numbers[j] > numbers[0]) {
			return numbers[0];
		}
		while (j > 0) {
			if (numbers[j - 1] > numbers[j]) {
				return numbers[j];
			}
			j--;
		}

		return numbers[0];
	}
}

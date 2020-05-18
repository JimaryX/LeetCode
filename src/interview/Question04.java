package interview;

public class Question04 {
	public static void main(String[] args) {
		int[][] num = {{-5}};
		System.out.println(findNumberIn2DArray(num, -5));
	}

	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix.length == 0) {
			return false;
		}
		int i = 0;
		int j = matrix[0].length - 1;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}

		return false;
	}
}

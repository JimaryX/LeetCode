package interview;

public class Question10 {
	public static void main(String[] args) {
		System.out.println(fib(45));
	}

	public static int fib(int n) {
		int i = 0;
		int j = 1;
		int sum = 0;
		for (int index = 2; index <= n; index++) {
			sum = (i + j)% 1000000007;
			i = j;
			j = sum;
		}

		return i;
	}
}

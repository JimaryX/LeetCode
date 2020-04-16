package leet_code03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetCode67 {
	public static void main(String[] args) {
//		Stream<String> echos = Stream.generate(() -> "Echo");
//		show("echos", echos);
		System.out.println(addBinary("100101", "101"));
	}

	public static String addBinary(String a, String b) {
		StringBuilder builder = new StringBuilder();
		int carry = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = carry;
			sum += i >= 0 ? a.charAt(i) - '0' : 0;
			sum += j >= 0 ? b.charAt(j) - '0' : 0;
			carry = sum / 2;
			builder.append(sum % 2);
		}
		builder.append(carry == 1 ? 1 : "");
		return builder.reverse().toString();
	}

	public static <T> void show(String title, Stream<T> stream) {
		final int SIZE = 10;
		List<T> firstElement = stream.limit(SIZE + 1).collect(Collectors.toList());
		System.out.println(title + ": ");
		for (int i = 0; i < firstElement.size(); i++) {
			if (i > 0)
				System.out.println(", ");
			if (i < SIZE)
				System.out.println(firstElement.get(i));
			else
				System.out.println("...");
		}
		System.out.println();
	}
}
